package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent africa = new Continent();
        Continent asia = new Continent();
        Continent europe = new Continent();
        africa.addCountry(new Country(new BigDecimal("68060502") ) );
        africa.addCountry(new Country(new BigDecimal("83914472") ) );
        africa.addCountry(new Country(new BigDecimal("65343775") ) );
        asia.addCountry(new Country(new BigDecimal("1427647786") ) );
        asia.addCountry(new Country(new BigDecimal("1352642280") ) );
        asia.addCountry(new Country(new BigDecimal("127202192") ) );
        europe.addCountry(new Country(new BigDecimal("103049039") ) );
        europe.addCountry(new Country(new BigDecimal("12414293") ) );
        europe.addCountry(new Country(new BigDecimal("51392565") ) );
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(europe);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("3291666904");
        assertEquals(expected, totalPopulation);
    }
}
