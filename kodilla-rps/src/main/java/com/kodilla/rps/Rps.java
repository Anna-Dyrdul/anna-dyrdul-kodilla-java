package com.kodilla.rps;

public class Rps {
    private User niceUser;
    private boolean end = false;

    public Rps(User niceUser) {
        this.niceUser = niceUser;
    }

    public void showRules(){
        System.out.println("Please read this:\n" +
                "*key 1 - play \"ROCK\"\n" +
                "*key 2 - play \"PAPER\"\n" +
                "*key 3 - play \"SCISSORS\"\n" +
                "*x - END GAME\n" +
                "*n - START FROM THE BEGINNING"
        );
    }

    public boolean startGame(){
        boolean newGame = false;
        while (!end){
            Round round = new Round();
            String userMovement = round.askUserForMovement();
            if(userMovement.equals("x")) //zmienic na switch??
                end = true;
            else if(userMovement.equals("n")) {
                end = true;
                newGame = true;
                Round.setNumberOfRoundsWhichUserLost(0); //czy to jest potrzebne?
                Round.setNumberOfRoundsWhichUserWon(0);
            }
            else if(userMovement.equals("1") || userMovement.equals("2") || userMovement.equals("3")){
                round.generateComputerMovement();
                round.compareMovements();
                end = checkIfTheGameShouldEnd();
            } else //moze exception??
                System.out.println("Wrong key!!! Try again");
        }
        return newGame;
    }

    public boolean checkIfTheGameShouldEnd() {
        if(niceUser.getHowManyRoundsToWin() == Round.getNumberOfRoundsWhichUserWon()
                || niceUser.getHowManyRoundsToWin() == Round.getNumberOfRoundsWhichUserLost())
            return true;
        else
            return false;
    }

    public void showResults() {
        if(Round.getNumberOfRoundsWhichUserWon() == Round.getNumberOfRoundsWhichUserLost() && Round.getNumberOfRoundsWhichUserLost()!=0)
            System.out.println("Draw");
        else {
            System.out.println("Here are your results:\nUser " + Round.getNumberOfRoundsWhichUserWon()
                    + " : " + Round.getNumberOfRoundsWhichUserLost() + " Computer");
            if (Round.getNumberOfRoundsWhichUserWon() > Round.getNumberOfRoundsWhichUserLost())
                System.out.println("You won!! Congratulations " + niceUser.getName());
            else if(Round.getNumberOfRoundsWhichUserWon() < Round.getNumberOfRoundsWhichUserLost())
                System.out.println("You lost!");
        }
    }


}
