package com.designpattern.model;



public class EvaluationMode {
    private String name;
    private double weight;

    public EvaluationMode(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
