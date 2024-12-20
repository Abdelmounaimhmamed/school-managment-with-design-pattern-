package com.designpattern.model;

public class GradeEntry {
    private Student student;
    private ModuleElement element;
    private double grade;

    public GradeEntry(Student student, ModuleElement element, double grade) {
        this.student = student;
        this.element = element;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public ModuleElement getElement() {
        return element;
    }

    public double getGrade() {
        return grade;
    }
}
