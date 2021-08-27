package com.kodilla.good.patterns.challenges.foodOrder;

public class HealthyShop implements OrderRealization {

    @Override
    public boolean procces(Purchaser purchaser) {
        System.out.println("Zamawiajacy: " + purchaser.getName() + " " + purchaser.getSurname() + "  produkt: " + purchaser.getNameOfProduct() + " ilość: " + purchaser.getWeight() + " kg ");
        return true;
    }

}
