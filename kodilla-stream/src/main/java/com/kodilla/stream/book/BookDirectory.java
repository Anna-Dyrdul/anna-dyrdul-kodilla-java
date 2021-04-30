package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {

    private final List<Bookk> theBookkList = new ArrayList<>();

    public BookDirectory() {
        theBookkList.add(new Bookk("Dylan Murphy", "Wolf of the mountain",
                2003, "0001"));
        theBookkList.add(new Bookk("Phoebe Pearson", "Slaves of dreams",
                2012, "0002"));
        theBookkList.add(new Bookk("Morgan Walsh", "Obliteration of heaven",
                2001, "0003"));
        theBookkList.add(new Bookk("Aimee Murphy", "Rejecting the night",
                2015, "0004"));
        theBookkList.add(new Bookk("Ryan Talley", "Gangsters and kings",
                2007, "0005"));
        theBookkList.add(new Bookk("Madelynn Carson", "Unity without duty",
                2007, "0006"));
        theBookkList.add(new Bookk("Giancarlo Guerrero", "Enemies of eternity",
                2009, "0007"));
    }

    public List<Bookk> getList() {
        return new ArrayList<>(theBookkList);
    }
}