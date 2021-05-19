package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("Hello! What's your name?");
        Scanner scName = new Scanner(System.in);
        String name = scName.next();
        System.out.println("Okay. How many rounds is it needed to win?");
        Scanner scRounds = new Scanner(System.in); //moze to wszystko w innej klasie?

        User user = new User(name, scRounds.nextInt());

        boolean startNewGame;

        do {
            Rps rps = new Rps(user);
            rps.showRules();
            startNewGame = rps.startGame();
            rps.showResults();
        } while (startNewGame);

    }
}
