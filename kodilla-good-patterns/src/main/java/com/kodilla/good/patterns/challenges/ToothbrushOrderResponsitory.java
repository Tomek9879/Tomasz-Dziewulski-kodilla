package com.kodilla.good.patterns.challenges;

public class ToothbrushOrderResponsitory implements OrderResponsitory {

    @Override
    public void createProduct(final User user, final String brand, final String type, final int volume, final String model, final int age, final String bred) {
        System.out.println("Zapisanie tranzakcji do bazy danych: Użytkownik: " + user.getUser() + " produkt - szczoteczka do zembów typ: " + type + " marka: " + brand + " ilosc: " + volume);
    }

}
