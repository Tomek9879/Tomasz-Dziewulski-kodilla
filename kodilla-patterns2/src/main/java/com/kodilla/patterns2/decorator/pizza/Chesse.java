package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Chesse extends AbstractPizzaDecorator{
    protected Chesse(BasicPizza basicPizza) {
        super(basicPizza);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"Chesse";
    }
}
