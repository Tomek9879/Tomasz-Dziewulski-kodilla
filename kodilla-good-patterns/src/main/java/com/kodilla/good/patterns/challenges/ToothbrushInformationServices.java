package com.kodilla.good.patterns.challenges;

public class ToothbrushInformationServices implements ProductInformationService {

    @Override
    public void send(final String brand, final String type, final int volume, final String model, final int age, final String bred) {
        System.out.println("e- mail: Produkt: szczoteczka do zembów: " + type + " marki: " + brand + " ilosc: " + volume + " została wysłana na podany przez pana/pania adres zamieszkania");
    }

}
