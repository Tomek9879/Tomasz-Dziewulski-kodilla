package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String Name;
    private BigDecimal peopleQuantity;

    public Country(String name,String peopleQuantity) {
        this.Name = name;
        this.peopleQuantity = new BigDecimal(peopleQuantity);

    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity ;
    }
}
