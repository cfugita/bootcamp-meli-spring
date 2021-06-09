package br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys;

import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Subject;

import java.util.List;

public class StudentFinals {
    private String message;
    private double averageGrade;
    private Student student;

    public StudentFinals(String message, double averageGrade, Student student) {
        this.message = message;
        this.averageGrade = averageGrade;
        this.student = student;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
