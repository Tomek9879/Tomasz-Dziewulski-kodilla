package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[]args){

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Ala",(text)->text+"abc");
        poemBeautifier.beautify("Ela",(text)->text+"abc");
        poemBeautifier.beautify("Ola",(text)->text+"abc");
        poemBeautifier.beautify("Kasia",(text)->text+"abc");
        poemBeautifier.beautify("Zosia",(text)->text+"abc");


        poemBeautifier.beautify("Ala",(text)->text.toUpperCase());

        poemBeautifier.beautify("Kasia",(text)->text+text.length());
        poemBeautifier.beautify("Zosia",(text)->text+text.length());

        poemBeautifier.beautify("Kasia",(text)->text.replace("Ka","nyy"));
        poemBeautifier.beautify("Zosia",(text)->text.replace("Zo","uuuaaalaal"));

        poemBeautifier.beautify("Kasia",(text)->text.concat("+ "));
        poemBeautifier.beautify("Zosia",(text)->text.concat("+ "));


    }
}
