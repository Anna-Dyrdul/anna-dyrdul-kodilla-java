package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when create OddNumbersExterminator with empty list, " +
            "then exterminate should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expectedResultEmptyList = new ArrayList<>();
        //When
        List<Integer> resultEmptyList = new ArrayList<>();
        resultEmptyList = oddNumbersExterminator.exterminate(Arrays.asList());
        //Then
        Assertions.assertEquals(expectedResultEmptyList, resultEmptyList);
    }

    @DisplayName("when create OddNumbersExterminator with normal list, " +
            "then exterminate should return list without odd numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expectedResultNormalList = new ArrayList<>(Arrays.asList(2,4));
        //When
        List<Integer> resultNormalList = new ArrayList<>();
        resultNormalList = oddNumbersExterminator.exterminate(Arrays.asList(1,2,3,4,5));
        //Then
        Assertions.assertEquals(expectedResultNormalList, resultNormalList);

    }
}
