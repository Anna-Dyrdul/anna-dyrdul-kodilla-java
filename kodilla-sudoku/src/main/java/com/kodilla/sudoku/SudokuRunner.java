package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuRunner {

    public static void main(String[] args) {
        boolean gameFinished = false;
        Scanner sc = new Scanner(System.in);
        SudokuBoard board = new SudokuBoard();
        System.out.println(board.toString());

        while(!gameFinished) {
            SudokuGame game = new SudokuGame();
            String input = sc.nextLine();
            if(input.equals("SUDOKU"))
                gameFinished = game.resolveSudoku(board);
            else {
                String[] coordinates = input.split(",");//1kolumna,2wiersz,3
                board.getBoardOfRows().get(Integer.parseInt(coordinates[1])-1).getRowOfElements().get(Integer.parseInt(coordinates[0])-1).setValue(Integer.parseInt(coordinates[2]));
                board.getBoardOfRows().get(Integer.parseInt(coordinates[1])-1).getRowOfElements().get(Integer.parseInt(coordinates[0])-1).getPossibleValue().remove(Integer.parseInt(coordinates[2]));
                System.out.println(board.toString());
            }
        }
    }
}
/*
Pętla wykonuje się tak długo, jak długo użytkownik chce rozwiązywać kolejne Sudoku.
Jeden przebieg pętli odpowiada rozwiązaniu jednej planszy Sudoku.
 */