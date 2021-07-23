package com.kodilla.good.patterns.challenges.food2door;


public class ExtraFoodPurchaseService implements PurchaseService {
    @Override
    public boolean buy(Shop shop, Product product, int quantity) {
        System.out.println("You bought " + product.getName() + " in quantity of " + quantity + " from ExtraFood.");
        return true;
    }
}
