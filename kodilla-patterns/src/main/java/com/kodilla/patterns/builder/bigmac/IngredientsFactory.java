package com.kodilla.patterns.builder.bigmac;

public enum IngredientsFactory {

    LETTUCE("LETTUCE"),
    ONION("ONION"),
    BACON("BACON"),
    CUCUMBER("CUCUMBER"),
    CHILLI_PEPPERS("CHILLI_PEPPERS"),
    MUSHROOMS("MUSHROOMS"),
    SHRIMPS("SHRIMPS"),
    CHEESE("CHEESE");

    private String ingredient;

    IngredientsFactory(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }
}