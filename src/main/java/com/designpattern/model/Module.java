package com.designpattern.model;



import java.util.*;


public class Module {
    private String code;
    private String name;
    private Branch branch;
    private List<ModuleElement> elements;

    public Module(String code, String name, Branch branch) {
        this.code = code;
        this.name = name;
        this.branch = branch;
        this.elements = new ArrayList<>();
    }

    public void addElement(ModuleElement element) {
        elements.add(element);
    }

    public List<ModuleElement> getElements() {
        return elements;
    }

    public Branch getBranch() {
        return branch;
    }
}