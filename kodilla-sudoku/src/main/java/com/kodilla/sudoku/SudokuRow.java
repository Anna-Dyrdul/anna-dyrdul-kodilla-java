package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    List<SudokuElement> rowOfElements = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i < 9; i++) {
            rowOfElements.add(new SudokuElement());
        }
    }

    @Override
    public String toString() {
        return rowOfElements.get(0).toString() + " " + rowOfElements.get(1).toString() + " " + rowOfElements.get(2).toString() +
                " | " + rowOfElements.get(3).toString() + " " + rowOfElements.get(4).toString() + " " + rowOfElements.get(5).toString() +
                " | " + rowOfElements.get(6).toString() + " " + rowOfElements.get(7).toString() + " " + rowOfElements.get(8).toString() + "\n";
    }

    public List<SudokuElement> getRowOfElements() {
        return rowOfElements;
    }
}
