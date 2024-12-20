package com.designpattern.model;

import java.util.ArrayList;
import java.util.List;

public class ModuleElement {
    private String name;
    private double coefficient;
    private Module module;
    private List<EvaluationMode> evaluationModes;

    public ModuleElement(String name, double coefficient, Module module) {
        this.name = name;
        this.coefficient = coefficient;
        this.module = module;
        this.evaluationModes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public Module getModule() {
        return module;
    }

    public void addEvaluationMode(EvaluationMode evaluationMode) {
        evaluationModes.add(evaluationMode);
    }

    public List<EvaluationMode> getEvaluationModes() {
        return evaluationModes;
    }
}