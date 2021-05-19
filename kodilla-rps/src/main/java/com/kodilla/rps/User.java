package com.kodilla.rps;

public class User {
    private String name;
    private int numberOfRoundsToWin;

    public User(String name, int howManyRoundsToWin) {
        this.name = name;
        this.numberOfRoundsToWin = howManyRoundsToWin;
    }

    public String getName() {
        return name;
    }

    public int getHowManyRoundsToWin() {
        return numberOfRoundsToWin;
    }

}
