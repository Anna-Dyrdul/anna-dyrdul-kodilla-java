package com.kodilla.good.patterns.challenges;

public class PurchaseRequest {
    private User user;
    private Article article;

    public PurchaseRequest(User user, Article article) {
        this.user = user;
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public Article getArticle() {
        return article;
    }
}
