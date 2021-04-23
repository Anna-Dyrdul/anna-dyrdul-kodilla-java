package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> listOfFigures = new ArrayList<>();

    public int addFigure(Shape shape) {
        listOfFigures.add(shape);
        return listOfFigures.size();
    }

    public int removeFigure(Shape shape) {
        listOfFigures.remove(shape);
        return listOfFigures.size();
    }

    public Shape getFigure(int n){
        return listOfFigures.get(n);
    }

    public String showFigures() {
        String list = "";
        for(int i=0; i< listOfFigures.size(); i++) {
            list += listOfFigures.get(i).getShapeName()+", ";
        }
        list = list.substring(0, list.length()-2);
        return list;
    }
    public List<Shape> getList() {
        return new ArrayList<>(listOfFigures);
    }
}
