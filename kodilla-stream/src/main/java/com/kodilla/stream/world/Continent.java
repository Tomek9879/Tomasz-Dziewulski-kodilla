package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String contitnetName;
    List<Country> Country=new ArrayList<>();


    public Continent(String contitnetName) {
        this.contitnetName = contitnetName;
    }

    public List<Country>getCountyList(){
        return Country;
    }
    public void addCountry(Country country){
        this.Country.add(country);
    }
}
