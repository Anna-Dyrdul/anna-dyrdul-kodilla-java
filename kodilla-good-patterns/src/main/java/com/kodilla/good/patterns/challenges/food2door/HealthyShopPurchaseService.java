package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopPurchaseService implements PurchaseService {
    @Override
    public boolean buy(Shop shop, Product product, int quantity) {
        System.out.println("You bought " + product.getProductName() +
                " in quantity of " + quantity + " from Healthy.");
        return true;
    }
}
