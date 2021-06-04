package com.kodilla.good.patterns.challenges;

public class PurchaseRequestRetriever {
    public PurchaseRequest retrieve() {
        User user = new User("John");

        Article article = new Article("pony",45.50, 1);

        return new PurchaseRequest(user, article);
    }

}
