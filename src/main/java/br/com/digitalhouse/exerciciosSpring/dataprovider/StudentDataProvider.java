package br.com.digitalhouse.exerciciosSpring.dataprovider;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.StudentRepositoryFake;
import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.StudentGateway;
import org.springframework.stereotype.Service;

@Service
public class StudentDataProvider implements StudentGateway {

    @Override
    public StudentFinals calculateGrade(Student student) {
        return StudentRepositoryFake.calculateGrade(student);
    }
}
