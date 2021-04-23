package com.kodilla.testing.shape;

public class Circle implements Shape {
    private final String name = "circle";
    private final String field = "pi*r^2";

    public String getShapeName(){
        return name;
    }
    public String getField() { return field; }

    @Override
    public String toString() {
        return name + " " +field;
    }
}
