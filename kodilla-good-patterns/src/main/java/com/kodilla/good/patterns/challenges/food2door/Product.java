package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class Product {
    private String productName;
    private LocalDate productExpirationDate ;

    public Product(String productName) {
        this.productName = productName;
        this.productExpirationDate = LocalDate.now();
    }

    public String getProductName() {
        return productName;
    }
}
