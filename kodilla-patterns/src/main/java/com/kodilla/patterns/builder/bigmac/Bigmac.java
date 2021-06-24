package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.strategy.social.SocialPublisher;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final BunFactory bun;
    private final BurgersFactory burgers;
    private final SauceFactory sauce;
    private List<IngredientsFactory> ingredients = new ArrayList<>();

    public Bigmac(final BunFactory bun, final BurgersFactory burgers, final SauceFactory sauce, List<IngredientsFactory> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public BunFactory getBun() {
        return bun;
    }

    public BurgersFactory getBurgers() {
        return burgers;
    }

    public SauceFactory getSauce() {
        return sauce;
    }

    public List<IngredientsFactory> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {

        private BunFactory bun;
        private BurgersFactory burgers;
        private SauceFactory sauce;
        private List<IngredientsFactory> ingredients = new ArrayList<>();

        public BigmacBuilder bun(BunFactory bun) {
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(BurgersFactory burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(SauceFactory sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(IngredientsFactory ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

}
