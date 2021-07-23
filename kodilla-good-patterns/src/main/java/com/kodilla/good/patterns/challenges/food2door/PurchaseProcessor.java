package com.kodilla.good.patterns.challenges.food2door;

public class PurchaseProcessor {
    private PurchaseRespository purchaseRespository;
    private PurchaseService purchaseService;

    public PurchaseProcessor(final PurchaseRespository purchaseRespository, final PurchaseService purchaseService) {
        this.purchaseRespository = purchaseRespository;
        this.purchaseService = purchaseService;
    }

    public void process(final PurchaseRequest purchaseRequest) {
        boolean isBought = purchaseService.buy(purchaseRequest.getShop(), purchaseRequest.getProduct(), purchaseRequest.getQuantity());
        if(isBought) {
            purchaseRespository.createPurchase(purchaseRequest.getShop(), purchaseRequest.getProduct(), purchaseRequest.getQuantity());
        } else {
            System.out.println("Ups... something went wrong with your purchase!");
        }
    }
}
