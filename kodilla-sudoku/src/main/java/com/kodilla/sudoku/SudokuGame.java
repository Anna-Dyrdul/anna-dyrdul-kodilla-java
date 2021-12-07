package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuGame {

    boolean resolveSudoku(SudokuBoard board) {
        List<Integer> occurringInAColumn = new ArrayList<>();
        for(int i = 0; i < 9; i++) {

            for(SudokuRow row : board.getBoardOfRows()) {
                List<Integer> occurringInARow = new ArrayList<>();
                for (SudokuElement element : row.getRowOfElements()) {
                    if (element.getValue() != -1) {
                        occurringInARow.add(element.getValue());
                        //List<Integer> result = row.getRowOfElements().stream().flatMap(str -> str.getPossibleValue().stream()).filter(value -> !value.equals(element.getValue())).collect(Collectors.toList());
                    }
                }
                for (SudokuElement element : row.getRowOfElements()) {
                    element.getPossibleValue().removeAll(occurringInARow);
                    if (element.getPossibleValue().size() == 1 && element.getValue() == -1)
                        element.setValue(element.getPossibleValue().poll());
                    else if (element.getPossibleValue().size() == 0 && element.getValue() == -1)
                        ;//tutaj rzuc wyjatkiem
                }

                if (row.getRowOfElements().get(i).getValue() != -1) {
                    occurringInAColumn.add(row.getRowOfElements().get(i).getValue());
                    //usun powtarzajce sie elementy, wstaw jesli nie ma innych mozliwosci, rzuc wyjatkiem
                }
            }
        }

        //zwraca info czy uzytkownik chce zrealizowac kolejne Sudoku
        return true;
    }
}
/*
powtarzamy powyższą operację dla każdego pola w tej samej kolumnie, a następnie dla każdego pola w tej samej sekcji
 */

/*
Brakuje
dla każdej cyfry z tablicy możliwych cyfr w aktualnym polu:
    nie występuje ani jako wpisana, ani jako możliwa cyfra w innym polu, wpisujemy ją do aktualnego pola,
 */