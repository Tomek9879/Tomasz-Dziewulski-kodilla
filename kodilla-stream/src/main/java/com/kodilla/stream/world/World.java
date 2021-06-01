package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class World {
List<Continent> continent=new ArrayList<>();

public void addContinent(Continent continent){
    this.continent.add(continent);

}
public BigDecimal getPeopleQuantity(){

    BigDecimal totalPeopleQuantity = continent.stream().flatMap(continent1->continent1.getCountyList().stream()).map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO,(sum,current)->sum=sum.add(current));


    return totalPeopleQuantity;
}
}
