package com.kodilla.good.patterns.challenges;

public class PhoneInformationServices implements ProductInformationService {

    @Override
    public void send(final String brand, final String type, final int volume, final String model, int age, String bred) {
        System.out.println("e- mail: Produkt: Telefon komurkowy : " + model + " marki: " + brand + " ilosc: " + volume + " została wysłana na podany przez pana/pania adres zamieszkania");
    }

}
