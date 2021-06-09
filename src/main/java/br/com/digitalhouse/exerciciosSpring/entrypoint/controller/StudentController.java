package br.com.digitalhouse.exerciciosSpring.entrypoint.controller;

import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;
import br.com.digitalhouse.exerciciosSpring.usecase.model.StudentUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
public class StudentController {
    private final StudentUseCase studentUseCase;

    public StudentController(StudentUseCase studentUseCase) {
        this.studentUseCase = studentUseCase;
    }

    @PostMapping  ("/averageGrade")
    public ResponseEntity<Object> calculateGrade (@RequestBody Student student) {
        return new ResponseEntity<Object>(this.studentUseCase.calculateGrades(student), HttpStatus.OK);
    }

}
