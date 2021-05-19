package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Round {
    private String chosenMovementByUser;
    private String chosenMovementByComputer;
    private static int numberOfRoundsWhichUserWon = 0;
    private static int numberOfRoundsWhichUserLost = 0;

    public static int getNumberOfRoundsWhichUserWon() {
        return numberOfRoundsWhichUserWon;
    }

    public static int getNumberOfRoundsWhichUserLost() {
        return numberOfRoundsWhichUserLost;
    }

    public static void setNumberOfRoundsWhichUserWon(int numberOfRoundsWhichUserWon) {
        Round.numberOfRoundsWhichUserWon = numberOfRoundsWhichUserWon;
    }

    public static void setNumberOfRoundsWhichUserLost(int numberOfRoundsWhichUserLost) {
        Round.numberOfRoundsWhichUserLost = numberOfRoundsWhichUserLost;
    }

    public String askUserForMovement(){
        System.out.println("Choose a move:");
        Scanner scMove = new Scanner(System.in);
        chosenMovementByUser = scMove.next();
        return chosenMovementByUser;
    }

    public void generateComputerMovement(){
        Random generator = new Random();
        do {
            chosenMovementByComputer = String.valueOf(generator.nextInt(4));
        } while (chosenMovementByComputer.equals("0"));
        System.out.println("Computer:" + chosenMovementByComputer);
    }

    public void compareMovements() {
        if(chosenMovementByUser.equals("1") && chosenMovementByComputer.equals("2"))
            numberOfRoundsWhichUserWon++;
        else if(chosenMovementByUser.equals("2") && chosenMovementByComputer.equals("3"))
            numberOfRoundsWhichUserWon++;
        else if(chosenMovementByUser.equals("3") && chosenMovementByComputer.equals("1"))
            numberOfRoundsWhichUserWon++;
        else if(!(chosenMovementByUser.equals(chosenMovementByComputer)))
            numberOfRoundsWhichUserLost++;
    }
}
