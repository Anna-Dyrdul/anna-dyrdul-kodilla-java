package com.kodilla.good.patterns.challenges;

public class AuctionPurchaseRepository implements PurchaseRepository{
    @Override
    public void createPurchase(User user, Article article) {
        System.out.println("We created purchase for "+
                user.getUserName()+" who bought "+
                article.getArticleName()+" at auction");
    }
}
