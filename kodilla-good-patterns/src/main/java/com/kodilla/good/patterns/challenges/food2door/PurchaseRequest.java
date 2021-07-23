package com.kodilla.good.patterns.challenges.food2door;

public class PurchaseRequest {
    private Shop shop;
    private Product product;
    private int quantity;

    public PurchaseRequest(Shop shop, Product product, int quantity) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
