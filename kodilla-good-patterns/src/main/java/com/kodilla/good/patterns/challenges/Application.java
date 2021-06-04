package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        ProductOrderService purchaseProcessor = new ProductOrderService(
                new MailService(), new AuctionPurchaseService(), new AuctionPurchaseRepository());
        purchaseProcessor.process(purchaseRequest);
    }

}