package com.kodilla.good.patterns.challenges;

public class DogInformationServices implements ProductInformationService {
    @Override
    public void send(final String brand, final String type, final int volume, final String model, final int age, final String bred) {
        System.out.println("e- mail: Produkt: Pies rasy: " + bred + " zostanie dostarczony na podany przez pana/pania adres zamieszkania");
    }
}
