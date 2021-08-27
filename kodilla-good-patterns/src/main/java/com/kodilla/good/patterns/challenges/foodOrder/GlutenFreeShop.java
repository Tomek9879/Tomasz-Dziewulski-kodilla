package com.kodilla.good.patterns.challenges.foodOrder;

public class GlutenFreeShop implements OrderRealization {

    public void bonus(int quantity) {
        if (quantity > 5) {
            System.out.println("W ramach programu lojalnościowego kljent po zakupie co najmniej pięciu produktów kljent otrzymuje jedną naklejkę" +
                    "kiedy nazbiera pięć naklejek będzie mógł je wymienić na dowolny produkt o wartości 10 zl");
        }
    }

    @Override
    public boolean procces(Purchaser purchaser) {
        System.out.println("Zamawiajacy: " + purchaser.getName() + " " + purchaser.getSurname() + "  produkt: " + purchaser.getNameOfProduct() + " ilość: " + purchaser.quantity);
        bonus(purchaser.quantity);
        return true;
    }

}
