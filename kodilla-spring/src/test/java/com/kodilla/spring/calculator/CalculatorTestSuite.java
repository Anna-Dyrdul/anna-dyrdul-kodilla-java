package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //When
        double result = calculator.add(1,2);
        //Then
        assertEquals(3, result);
    }

    @Test
    void testSub() {
        //Given
        //When
        double result = calculator.sub(-3,2);
        //Then
        assertEquals(-5, result);
    }

    @Test
    void testMul() {
        //Given
        //When
        double result = calculator.mul(1,2);
        //Then
        assertEquals(2, result);
    }

    @Test
    void testDiv() {
        //Given
        //When
        double result = calculator.div(1,2);
        //Then
        assertEquals(0.5, result);
    }

    @Test
    void testDivButWithZero() {
        //Given
        //When
        //Then
        assertThrows(ArithmeticException.class, () -> calculator.div(1,0));
    }
}
