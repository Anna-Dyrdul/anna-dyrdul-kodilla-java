package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    //Klasa World powinna zawierać kolekcję kontynentów.
    List<Continent> listOfContinent = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinent.add(continent);
    }

    //W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal,
    // która używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.
    public BigDecimal getPeopleQuantity(){
        return listOfContinent.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
