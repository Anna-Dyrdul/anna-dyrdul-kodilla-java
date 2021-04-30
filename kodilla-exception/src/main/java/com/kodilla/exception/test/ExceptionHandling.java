package com.kodilla.exception.test;

public class ExceptionHandling {

    SecondChallenge secondChallenge = new SecondChallenge();

    public void tryProbablyIWillThrowException(double a, double b) throws Exception{
        try {
            String textFromChallenge = secondChallenge.probablyIWillThrowException(a,b);
            System.out.println(textFromChallenge);
        } catch (Exception e) {
            System.out.println("Oh no! Something went wrong! Error:" + e);
            throw new Exception();
        } finally {
            System.out.println("I have tried");
        }
    }
}
