package com.kodilla.patterns.builder.bigmac;

public enum SauceFactory {

    STANDARD("STANDARD"),
    THOUSAND_ISLAND("THOUSAND ISLAND"),
    BARBECUE("BARBECUE");

    private String sauce;

    SauceFactory(String sauce) {
        this.sauce = sauce;
    }

    public String getSauce() {
        return sauce;
    }
}
