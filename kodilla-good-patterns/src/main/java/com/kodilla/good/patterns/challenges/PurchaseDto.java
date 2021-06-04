package com.kodilla.good.patterns.challenges;

public class PurchaseDto {
    private User user;
    private boolean isBought;

    public PurchaseDto(User user, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }
}
