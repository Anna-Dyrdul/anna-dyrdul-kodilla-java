package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodPurchaseRespository implements PurchaseRespository{
    @Override
    public void createPurchase(Shop shop, Product product, int quantity) {
        System.out.println("We created purchase from "+
                shop.getShopName()+": "+
                product.getProductName()+" - "+ quantity);
    }
}
