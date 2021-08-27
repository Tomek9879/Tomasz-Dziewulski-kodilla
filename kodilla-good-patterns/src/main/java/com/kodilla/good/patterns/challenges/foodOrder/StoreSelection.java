package com.kodilla.good.patterns.challenges.foodOrder;

public class StoreSelection {

    public OrderRealization storeSelection(Purchaser purchaser) {

        if (purchaser.getNameOfShop().equals("ExtraFoodShop"))
            return new ExtraFoodShop();
        if (purchaser.getNameOfShop().equals("GlutenFreeShop"))
            return new GlutenFreeShop();
        if (purchaser.getNameOfShop().equals("HealthyShop"))
            return new HealthyShop();
        else
            return null;
    }

    public void storeProcessPrint(OrderRealization orderRealization, Purchaser purchaser) {

        if (orderRealization != null)
            orderRealization.procces(purchaser);
        else
            System.out.println("Podano błędno nazwe sklepu");
    }

}
