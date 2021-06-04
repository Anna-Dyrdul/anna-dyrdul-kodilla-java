package com.kodilla.good.patterns.challenges;

public class AuctionPurchaseService implements PurchaseService{

    @Override
    public boolean buy(User user, Article article) {
        if(article.getQuantity() > 0){
            return true;
        }
        return false;
    }
}
