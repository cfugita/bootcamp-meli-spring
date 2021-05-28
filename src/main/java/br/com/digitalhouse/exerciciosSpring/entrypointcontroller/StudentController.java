package br.com.digitalhouse.exerciciosSpring.entrypointcontroller;

import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;
import br.com.digitalhouse.exerciciosSpring.usecase.model.StudentUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/diploma")
@RestController
public class StudentController {
    private final StudentUseCase studentUseCase;

    public StudentController(StudentUseCase studentUseCase) {
        this.studentUseCase = studentUseCase;
    }

    @PostMapping  (value = "/student",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> calculateGrade (@RequestBody Student student) {
        try {
            return new ResponseEntity<Object>(this.studentUseCase.calculateGrades(student), HttpStatus.OK);
        } catch (RuntimeException ex) {
            return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
