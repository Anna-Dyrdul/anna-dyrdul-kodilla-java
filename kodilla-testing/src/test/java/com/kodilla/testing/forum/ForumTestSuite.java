package com.kodilla.testing.forum;

import com.kodilla.testing.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
    )
    @Test
    void testCaseCalculator() {

        //Given
        Calculator calculator = new Calculator();

        //When
        int resultOfAdd = calculator.add(5,3);
        int resultOfSubtract = calculator.subtract(5,3);
        int expectedResultOfAdd = 8;
        int expectedResultOfSubtract = 2;

        //Then
        Assertions.assertEquals(expectedResultOfAdd, resultOfAdd);

        Assertions.assertEquals(expectedResultOfSubtract, resultOfSubtract);

    }
}
