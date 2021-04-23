package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final String name = "triangle";
    private final String field = "0.5*a*h";


    public String getShapeName(){
        return "triangle";
    }

    public String getField() {
        return "0.5*a*h";
    }

    @Override
    public String toString() {
        return name + " " +field;
    }
}
