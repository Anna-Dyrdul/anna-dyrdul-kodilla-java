package com.kodilla.good.patterns.challenges.food2door;


public class Food2DoorApplication {
    public static void main(String[] args) {
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequestToExtraFoodShop = purchaseRequestRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(
                new ExtraFoodPurchaseRespository(), new ExtraFoodPurchaseService());
        purchaseProcessor.process(purchaseRequestToExtraFoodShop);
    }
}
