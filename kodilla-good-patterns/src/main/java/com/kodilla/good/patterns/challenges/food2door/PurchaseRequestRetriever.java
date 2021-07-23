package com.kodilla.good.patterns.challenges.food2door;

public class PurchaseRequestRetriever {
    public PurchaseRequest retrieve() {
        Shop extraFoodShop = new Shop("ExtraFoodShop");
        Product milk = new Product("milk");
        int quantity = 8;

        return new PurchaseRequest(extraFoodShop, milk, quantity);
    }
}
