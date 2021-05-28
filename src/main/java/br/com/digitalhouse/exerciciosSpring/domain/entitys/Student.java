package br.com.digitalhouse.exerciciosSpring.domain.entitys;

import java.util.List;

public class Student {
    private String name;
    private List<ClassCollege> classColleges;

    public Student(String name, List<ClassCollege> classColleges) {
        this.name = name;
        this.classColleges = classColleges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassCollege> getClasses() {
        return classColleges;
    }

    public void setClasses(List<ClassCollege> classColleges) {
        this.classColleges = classColleges;
    }
}
