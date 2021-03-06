package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        assertEquals("Go to supermarket", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        assertEquals("Paint kitchen", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        assertEquals("Go to school", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}
