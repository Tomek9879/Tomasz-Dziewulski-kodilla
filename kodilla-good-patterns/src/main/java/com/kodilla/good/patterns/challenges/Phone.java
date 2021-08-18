package com.kodilla.good.patterns.challenges;

public class Phone implements ProductInformation {

    final User user;
    final String brand;
    final String model;
    final int Volume;

    public Phone(final User user, final String brand, final String model, final int Volume) {
        this.user = user;
        this.brand = brand;
        this.model = model;
        this.Volume = Volume;
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int getVolume() {
        return Volume;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getBred() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

}
