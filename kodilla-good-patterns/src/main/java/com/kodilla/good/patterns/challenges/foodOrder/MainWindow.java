package com.kodilla.good.patterns.challenges.foodOrder;

public class MainWindow {
    public static void main(String[] args) {

        Purchaser purchaser_1 = new Purchaser("Jan", "Adamiak", "ExtraFoodShop", 0, 3, "Apple");
        StoreSelection selection_1 = new StoreSelection();
        selection_1.storeProcessPrint(selection_1.storeSelection(purchaser_1), purchaser_1);

        Purchaser purchaser_2 = new Purchaser("Adam", "Miły", "GlutenFreeShop", 0, 7, "Bread");
        StoreSelection selection_2 = new StoreSelection();
        selection_1.storeProcessPrint(selection_1.storeSelection(purchaser_2), purchaser_2);

        Purchaser purchaser_3 = new Purchaser("Jan", "Adamiak", "HealthyShop", 10, 0, "Tomatoes");
        StoreSelection selection_3 = new StoreSelection();
        selection_1.storeProcessPrint(selection_1.storeSelection(purchaser_3), purchaser_3);

    }

}
