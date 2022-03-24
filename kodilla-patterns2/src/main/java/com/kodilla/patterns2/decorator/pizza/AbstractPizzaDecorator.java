package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements PizzaOrder {


    private final BasicPizza basicPizza;

    protected  AbstractPizzaDecorator(BasicPizza basicPizza){
        this.basicPizza=basicPizza;
    }

    @Override
    public BigDecimal getCost() {
        return basicPizza.getCost();
    }

    @Override
    public String getDescription() {
        return basicPizza.getDescription();
    }
}
