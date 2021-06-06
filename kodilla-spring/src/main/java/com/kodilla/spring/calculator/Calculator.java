package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double resultOfAdd = a + b;
        display.displayValue(resultOfAdd);
        return resultOfAdd;
    }

    public double sub(double a, double b) {
        double resultOfSub = a - b;
        display.displayValue(resultOfSub);
        return resultOfSub;
    }

    public double mul(double a, double b) {
        double resultOfMul = a * b;
        display.displayValue(resultOfMul);
        return resultOfMul;
    }

    public double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        double resultOfDiv = a / b;
        display.displayValue(resultOfDiv);
        return resultOfDiv;
    }
}
