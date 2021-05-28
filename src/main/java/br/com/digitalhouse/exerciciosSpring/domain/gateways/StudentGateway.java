package br.com.digitalhouse.exerciciosSpring.domain.gateways;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;

public interface StudentGateway {
    StudentFinals calculateGrade (Student student);
}
