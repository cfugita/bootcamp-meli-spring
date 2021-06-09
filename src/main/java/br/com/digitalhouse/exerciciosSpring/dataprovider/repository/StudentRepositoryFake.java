package br.com.digitalhouse.exerciciosSpring.dataprovider.repository;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Subject;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;

public class StudentRepositoryFake {

    public static StudentFinals calculateGrade (Student student) {
        double averageGrade = 0, qtClasses = 0;

        for(Subject subject : student.getSubjects()){
            averageGrade += subject.getGrade();
            ++qtClasses;
        }

        averageGrade /= qtClasses;

        String message = "Sua média foi de " + averageGrade;

        return new StudentFinals(message, averageGrade, student);
    }
}
