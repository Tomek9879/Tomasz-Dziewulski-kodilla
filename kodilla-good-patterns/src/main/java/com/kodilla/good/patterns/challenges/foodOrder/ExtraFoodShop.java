package com.kodilla.good.patterns.challenges.foodOrder;

public class ExtraFoodShop implements OrderRealization {

    public void freeDeliver(int quantity) {
        if (quantity > 2) {
            System.out.println("Przy tej ilosci zamówionego produktu dostawe produktu jest darmowa");
        }

    }

    @Override
    public boolean procces(Purchaser purchaser) {
        System.out.println("Zamawiajacy: " + purchaser.getName() + " " + purchaser.getSurname() + "  produkt: " + purchaser.getNameOfProduct() + " ilość: " + purchaser.quantity);
        freeDeliver(purchaser.getQuantity());
        return true;
    }

}
