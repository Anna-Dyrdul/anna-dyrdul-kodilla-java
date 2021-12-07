package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    List<SudokuRow> boardOfRows = new ArrayList<>();

    public SudokuBoard() {
        for(int i = 0; i < 9; i++) {
            this.boardOfRows.add(new SudokuRow());
        }
    }

    @Override
    public String toString() {
        return boardOfRows.get(0).toString() +
                boardOfRows.get(1).toString() +
                boardOfRows.get(2).toString() +
                " - - - - - - - - - -" + "\n" +
                boardOfRows.get(3).toString() +
                boardOfRows.get(4).toString() +
                boardOfRows.get(5).toString() +
                " - - - - - - - - - -" + "\n" +
                boardOfRows.get(6).toString() +
                boardOfRows.get(7).toString() +
                boardOfRows.get(8).toString();
    }

    public List<SudokuRow> getBoardOfRows() {
        return boardOfRows;
    }
}