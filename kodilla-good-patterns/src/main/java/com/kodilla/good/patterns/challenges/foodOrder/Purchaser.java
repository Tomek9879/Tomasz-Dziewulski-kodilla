package com.kodilla.good.patterns.challenges.foodOrder;

public class Purchaser {

    public String name;
    public String surname;
    public int weight;
    public int quantity;
    public String nameOfProduct;
    public String nameOfShop;

    public Purchaser(String name, String surname, String nameOfShop, int weight, int quantity, String nameOfProduct) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.quantity = quantity;
        this.nameOfProduct = nameOfProduct;
        this.nameOfShop = nameOfShop;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

}
