package br.com.digitalhouse.exerciciosSpring.usecase.impl;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Subject;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.StudentGateway;
import br.com.digitalhouse.exerciciosSpring.entrypoint.exceptions.ValidationErrorException;
import br.com.digitalhouse.exerciciosSpring.usecase.model.StudentUseCase;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class StudentUseCaseImpl implements StudentUseCase {
    private StudentGateway studentGateway;

    public StudentUseCaseImpl(StudentGateway studentGateway) {
        this.studentGateway = studentGateway;
    }

    @Override
    public StudentFinals calculateGrades(Student student) {
        if(!isNameValid(student.getName())) { throw new ValidationErrorException("Student name " + student.getName() + " is not valid."); }

        for(Subject subject : student.getSubjects()) {
            if(!isNameValid(subject.getName())) { throw new ValidationErrorException("Subject name " + subject.getName() + " is not valid."); }
            if(!isGradeValid(subject.getGrade())) { throw new ValidationErrorException("Subject grade for " + subject.getName() + " is not valid."); }
        }
        return studentGateway.calculateGrade(student);
    }

    Boolean isNameValid (String name) {
        if(name.length() < 8){ return false; }
        if(name.length() > 50) { return false; }
        return name.toLowerCase(Locale.ROOT).replaceAll("\\s+", "").chars().allMatch(Character::isLetter);
    }

    Boolean isGradeValid (double grade) {
        if(grade > 10) { return false; }
        return !(grade < 0);
    }
}
