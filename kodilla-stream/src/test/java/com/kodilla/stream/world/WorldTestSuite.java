package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){

        World Swiat = new World();

        Continent Europa = new Continent("Europa");
        Europa.addCountry(new Country("Polska","123452124"));
        Europa.addCountry(new Country("Niemcy","12344524"));
        Europa.addCountry(new Country("Serbia","452452154"));

        Continent Azja= new Continent("Azja");
        Azja.addCountry(new Country("Taiwan","452139"));
        Azja.addCountry(new Country("Korea Poł","2145215"));

        Continent AmerykaPolnocna = new Continent("Ameryka Polnocna ");
        Europa.addCountry(new Country("Stany Zjednoczone","545212154"));
        Europa.addCountry(new Country("Kanada","21121521521"));

        Swiat.addContinent(Europa);
        Swiat.addContinent(Azja);
        Swiat.addContinent(AmerykaPolnocna);

       BigDecimal PeopleCount= new BigDecimal("22257579831");


        assertEquals(PeopleCount,Swiat.getPeopleQuantity());






    }

}
