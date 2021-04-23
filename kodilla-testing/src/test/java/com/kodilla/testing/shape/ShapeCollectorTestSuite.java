package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test for ShapeCollector")
    class TestShapeCollector {
        @Test
        void testAddFigure() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Assertions.assertEquals(1, shapeCollector.addFigure(new Circle())); //addFigure returns size of the list
        }

        @Test
        void testRemoveFigure() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);
            Square square = new Square();
            shapeCollector.addFigure(square);
            Assertions.assertEquals(1,shapeCollector.removeFigure(circle));//removeFigure returns size of the list
        }

        @Test
        void testGetFigure() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);
            Assertions.assertEquals(shapeCollector.getList().get(0), shapeCollector.getFigure(0));
        }

        @Test
        void testShowFigures() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);
            Square square = new Square();
            shapeCollector.addFigure(square);
            Triangle triangle = new Triangle();
            shapeCollector.addFigure(triangle);
            String expected = "circle, square, triangle";
            Assertions.assertEquals(expected, shapeCollector.showFigures());
        }

        @Test
        void testGetList() {
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);
            List<Shape> expectedList = new ArrayList<>();
            expectedList.add(circle);
            Assertions.assertEquals(expectedList, shapeCollector.getList());
        }
    }
}
