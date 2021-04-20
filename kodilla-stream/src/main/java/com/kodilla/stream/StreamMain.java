package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Making my text pretty");

        poemBeautifier.beautify("beautiful day.", "What a ", (textNormal, textBeautiful) -> textBeautiful + textNormal);
        poemBeautifier.beautify("beautiful day.", "What a ", (textNormal, textBeautiful) -> textBeautiful + "very " +textNormal);
        poemBeautifier.beautify("beautiful day.", "What a ", (textNormal, textBeautiful) -> {
            String myPrettyStr = textBeautiful + textNormal;
            return myPrettyStr.toUpperCase();
        });
        poemBeautifier.beautify("beautiful day.", "What a ", (textNormal, textBeautiful) -> {
            String myPrettyStr = textBeautiful + textNormal;
            return myPrettyStr.substring(7);
        });
        poemBeautifier.beautify("beautiful day.", "What a ", (textNormal, textBeautiful) -> {
            String myPrettyStr = textBeautiful + textNormal;
            return myPrettyStr +  myPrettyStr.length();
        });
    }
}