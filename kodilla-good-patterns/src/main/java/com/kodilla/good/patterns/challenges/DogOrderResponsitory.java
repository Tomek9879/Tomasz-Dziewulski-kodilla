package com.kodilla.good.patterns.challenges;

public class DogOrderResponsitory implements OrderResponsitory {

    @Override
    public void createProduct(final User user, final String brand, final String type, final int Volume, final String model, final int age, final String bred) {
        System.out.println("Zapisanie tranzakcji do bazy danych: Użytkownik: " + user.getUser() + " produkt- Pies rasy: " + bred + " wiek: " + age + " lat ");
    }
}
