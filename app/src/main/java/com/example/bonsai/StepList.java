package com.example.bonsai;


import java.util.ArrayList;

public class StepList {

    @com.google.gson.annotations.SerializedName("steps")
    ArrayList<String> steps;

    @com.google.gson.annotations.SerializedName("creator")
    String creator;

    @com.google.gson.annotations.SerializedName("stepNumber")
    int stepNumber;

    public StepList(String creator) {
        steps = new ArrayList<String>();
        stepNumber = 0;
    }

    public void addStep(String step) {
        steps.add(step);
        stepNumber += 1;
    }

    public void removeStep(int stepNum) {
        steps.remove(stepNum);
        stepNumber -= 1;
    }

}
