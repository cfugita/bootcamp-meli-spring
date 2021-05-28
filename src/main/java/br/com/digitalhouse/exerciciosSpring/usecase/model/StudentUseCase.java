package br.com.digitalhouse.exerciciosSpring.usecase.model;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;

public interface StudentUseCase {
    StudentFinals calculateGrades(Student student);
}
