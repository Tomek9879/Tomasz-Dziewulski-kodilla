package com.kodilla.good.patterns.challenges;

public class DogProduct implements ProductInformation {

    final User user;
    final String bred;
    final int age;


    public DogProduct(User user, String bred, int age) {
        this.user = user;
        this.bred = bred;
        this.age = age;

    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int getVolume() { return 0; }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBred() {
        return bred;
    }

    @Override
    public int getAge() {
        return age;
    }
}
