package com.kodilla.good.patterns.challenges;

public class Article {
    private String articleName;
    private double price;
    private int quantity;

    public Article(String articleName, double price, int quantity) {
        this.articleName = articleName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getArticleName() {
        return articleName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        return articleName.equals(article.articleName);
    }

    @Override
    public int hashCode() {
        return articleName.hashCode();
    }
}
