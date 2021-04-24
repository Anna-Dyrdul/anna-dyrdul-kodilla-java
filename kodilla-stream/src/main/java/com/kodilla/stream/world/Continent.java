package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    //Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie.
    List<Country> listOfCounties = new ArrayList<>();

    public void addCountry(Country country){
        listOfCounties.add(country);
    }

    public List<Country> getListOfCountries(){
        return listOfCounties;
    }

}
