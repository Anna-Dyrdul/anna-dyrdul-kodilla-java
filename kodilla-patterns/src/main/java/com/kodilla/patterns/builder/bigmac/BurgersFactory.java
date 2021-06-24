package com.kodilla.patterns.builder.bigmac;

public enum BurgersFactory {

    ONE("ONE"),
    TWO("TWO"),
    THREE("THREE");

    private String burgers;

    BurgersFactory(String burgers) {
        this.burgers = burgers;
    }

    public String getBurgers() {
        return burgers;
    }
}
