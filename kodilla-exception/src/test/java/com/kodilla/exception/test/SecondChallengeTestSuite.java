package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testTryProbablyIWillThrowException () {
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //When & then
        assertAll(
                () -> assertDoesNotThrow(() -> exceptionHandling.tryProbablyIWillThrowException(1.5,2)),
                () -> assertDoesNotThrow(() -> exceptionHandling.tryProbablyIWillThrowException(1, 1.51)),
                () -> assertDoesNotThrow(() -> exceptionHandling.tryProbablyIWillThrowException(1.99, 1.49)),
                () -> assertThrows(Exception.class, () -> exceptionHandling.tryProbablyIWillThrowException(5, 1.5))
        );
    }

}
