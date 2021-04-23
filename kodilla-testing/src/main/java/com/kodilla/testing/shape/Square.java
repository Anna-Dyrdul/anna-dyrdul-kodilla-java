package com.kodilla.testing.shape;

public class Square implements Shape {
    private final String name = "square";
    private final String field = "a*a";

    public String getShapeName(){
        return "square";
    }

    public String getField(){
        return "a*a";
    }

    @Override
    public String toString() {
        return name + " " +field;
    }
}
