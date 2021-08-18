package com.kodilla.good.patterns.challenges;

public class ToothbrushOrderServices implements OrderService {

    @Override
    public boolean order(final User user, final String brand, final String type, final int volume, final String model, final int age, final String bred) {
        System.out.println("Informacja o zakupionym produkcie: zamówienie dla kljenta: " + user.getUser() + " to szczoteczka do zembów: " + type + " marki: " + brand + "  ilosc: " + volume + "szt");
        return true;
    }

}
