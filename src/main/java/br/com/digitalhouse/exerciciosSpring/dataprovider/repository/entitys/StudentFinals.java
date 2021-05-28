package br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys;

public class StudentFinals {
    private String name;
    private String message;
    private double averageGrade;

    public StudentFinals(String name, String message, double averageGrade) {
        this.name = name;
        this.message = message;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
