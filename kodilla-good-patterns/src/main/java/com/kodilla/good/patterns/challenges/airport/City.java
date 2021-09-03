package com.kodilla.good.patterns.challenges.airport;

import java.time.LocalTime;

public class City {
    private String place;
    private LocalTime odlot;
    private LocalTime przylot;

    public City(String place, String odlot, String przylot) {
        this.place = place;
        this.odlot = LocalTime.parse(odlot);
        this.przylot = LocalTime.parse(przylot);
    }

    public String getPlace() {
        return place;
    }

    public LocalTime getOdlot() {
        return odlot;
    }

    public LocalTime getPrzylot() {
        return przylot;
    }

    @Override
    public String toString() {
        return "City{" +
                "place='" + place + '\'' +
                ", odlot=" + odlot +
                ", przylot=" + przylot +
                '}';
    }
}
