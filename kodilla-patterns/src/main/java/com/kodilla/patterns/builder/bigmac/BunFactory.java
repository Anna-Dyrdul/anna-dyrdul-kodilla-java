package com.kodilla.patterns.builder.bigmac;

public enum BunFactory {

    WITH_SESAME("WITH_SESAME"),
    WITHOUT_SESAME("WITHOUT_SESAME");

    private String bun;

    BunFactory(String bun) {
        this.bun = bun;
    }

    public String getBun() {
        return bun;
    }
}
