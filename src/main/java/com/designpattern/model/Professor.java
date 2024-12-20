package com.designpattern.model;

import java.util.*;


public class Professor extends User {
    private List<ModuleElement> assignedElements;

    public Professor(String username, String password) {
        super(username, password);
        this.assignedElements = new ArrayList<>();
    }

    public void addElement(ModuleElement element) {
        assignedElements.add(element);
    }

    public List<ModuleElement> getAssignedElements() {
        return assignedElements;
    }

    public void enterGrades() {
        // Implement logic for entering grades
    }

    public void validateGrades() {
        // Implement logic for validating grades
    }
}