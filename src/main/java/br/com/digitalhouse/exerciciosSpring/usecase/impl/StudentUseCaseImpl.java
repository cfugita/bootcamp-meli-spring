package br.com.digitalhouse.exerciciosSpring.usecase.impl;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.StudentGateway;
import br.com.digitalhouse.exerciciosSpring.usecase.model.StudentUseCase;
import org.springframework.stereotype.Service;

@Service
public class StudentUseCaseImpl implements StudentUseCase {
    private StudentGateway studentGateway;

    public StudentUseCaseImpl(StudentGateway studentGateway) {
        this.studentGateway = studentGateway;
    }

    @Override
    public StudentFinals calculateGrades(Student student) {
        return studentGateway.calculateGrade(student);
    }
}
