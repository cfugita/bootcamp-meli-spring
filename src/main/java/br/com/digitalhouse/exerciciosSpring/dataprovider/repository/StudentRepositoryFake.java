package br.com.digitalhouse.exerciciosSpring.dataprovider.repository;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.ClassCollege;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;

public class StudentRepositoryFake {

    public static StudentFinals calculateGrade (Student student) {
        double averageGrade = 0, qtClasses = 0;

        for(ClassCollege classCollege : student.getClasses()){
            averageGrade += classCollege.getGrade();
            ++qtClasses;
        }

        averageGrade /= qtClasses;

        String message = (averageGrade > 9) ? "Congratulations!" : "Not yet.";

        return new StudentFinals(student.getName(), message, averageGrade);
    }
}
