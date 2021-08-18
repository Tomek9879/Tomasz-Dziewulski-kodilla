package com.kodilla.good.patterns.challenges;

public class ToothbrushProduct implements ProductInformation {

    final User user;
    final String type;
    final String brand;
    final int volume;
    final String model;

    ToothbrushProduct(final User user, final String type, final String brand, final int volume, final String model) {
        this.user = user;
        this.type = type;
        this.brand = brand;
        this.volume = volume;
        this.model = model;
    }

    @Override
    public String getModel() { return model; }

    @Override
    public String getBred() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public int getVolume() {
        return volume;
    }

}

