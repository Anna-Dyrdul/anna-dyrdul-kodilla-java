package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultOfAdd = calculator.add(5,3);
        int resultOfSubtract = calculator.subtract(5,3);

        if(resultOfAdd == (5+3)){
            System.out.println("Test of ad: ok");
        }else{
            System.out.println("Error!");
        }

        if(resultOfSubtract == (5-3)){
            System.out.println("Test of subtract: ok");
        }else{
            System.out.println("Error!");
        }
    }
}
