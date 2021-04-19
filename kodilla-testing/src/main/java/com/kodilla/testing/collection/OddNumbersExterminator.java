package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    List<Integer> listWithoutOdd;

    public OddNumbersExterminator() {
        listWithoutOdd = new ArrayList<>();
    }

    public List<Integer> exterminate(List<Integer> number){
        int temporaryValue;
        for (int i=0; i < number.size(); i++){
            temporaryValue =  number.get(i);
            if(temporaryValue %2 ==0){
                listWithoutOdd.add(temporaryValue);
            }
        }
        return listWithoutOdd;
    }

}
