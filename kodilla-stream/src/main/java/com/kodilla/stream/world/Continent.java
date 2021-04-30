package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    List<Country> listOfCounties = new ArrayList<>();

    public void addCountry(Country country){
        listOfCounties.add(country);
    }

    public List<Country> getListOfCountries(){
        return listOfCounties;
    }

}
