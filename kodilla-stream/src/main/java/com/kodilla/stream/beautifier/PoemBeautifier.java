package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textNormal, String textBeautiful, PoemDecorator poemDecorator){
        String beauty = poemDecorator.decorate(textNormal, textBeautiful);
        System.out.println(beauty);
    }
}
