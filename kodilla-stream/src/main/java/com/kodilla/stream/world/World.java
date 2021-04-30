package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> listOfContinent = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinent.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return listOfContinent.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
