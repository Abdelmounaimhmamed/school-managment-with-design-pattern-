package com.designpattern.model;

public class Student {
    private String id;
    private String name;
    private String branch;

    public Student(String id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }
}
