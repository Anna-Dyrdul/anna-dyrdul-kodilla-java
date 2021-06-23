package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return  new ShoppingTask("Go to supermarket", "oat milk", 2.0);
            case PAINTING:
                return  new PaintingTask("Paint kitchen", "blue", "kitchen");
            case DRIVING:
                return new DrivingTask("Go to school", "school", "bike");
            default:
                return null;
        }
    }
}
