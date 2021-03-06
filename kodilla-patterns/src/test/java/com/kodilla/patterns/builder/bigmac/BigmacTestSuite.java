package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac= new Bigmac.BigmacBuilder()
                .bun(BunFactory.WITH_SESAME)
                .burgers(BurgersFactory.TWO)
                .ingredient(IngredientsFactory.BACON)
                .sauce(SauceFactory.THOUSAND_ISLAND)
                .ingredient(IngredientsFactory.CUCUMBER)
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);
    }
}