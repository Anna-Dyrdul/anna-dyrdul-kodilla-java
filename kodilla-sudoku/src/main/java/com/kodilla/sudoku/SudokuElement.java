package com.kodilla.sudoku;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SudokuElement {
    public static int EMPTY = -1;
    private int value = EMPTY;
    private ArrayDeque<Integer> possibleValue = new ArrayDeque<>();//moze kolejka?cos co nie trzeba znac indeksu

    public SudokuElement() {
        possibleValue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public int getValue() {
        return value;
    }

    public ArrayDeque<Integer> getPossibleValue() {
        return possibleValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
