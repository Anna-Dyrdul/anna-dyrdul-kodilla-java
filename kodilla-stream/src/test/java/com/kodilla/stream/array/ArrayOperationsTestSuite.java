package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    void testArrayOperations(){
        //Given
        int arrayToTest[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,34,35,66,23,24,65,34};
        double expectedAverage = 18.6;

        //When
        OptionalDouble resultAverage = ArrayOperations.getAverage(arrayToTest);

        //Then
        Assertions.assertEquals(expectedAverage, resultAverage.getAsDouble(), 0.001);
    }
}
