package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String shopName;
    private List<Product> availableProducts;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.availableProducts = new ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public List<Product> getAvailableProducts() {
        return availableProducts;
    }

    public void addAvailableProduct(Product product) {
        availableProducts.add(product);
    }
}
