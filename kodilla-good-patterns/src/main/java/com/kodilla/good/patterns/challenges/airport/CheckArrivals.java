package com.kodilla.good.patterns.challenges.airport;

public class CheckArrivals {

    public void printArrivals(String nameOfCity) {

        ArrivalsRealization arrivals = new ArrivalsRealization();

        arrivals.arrivalsRealization().stream().filter(e -> e.getNameAirportOfStop().equals(nameOfCity)).forEach(e -> System.out.println("Przylot samolotu do " + e.getNameAirportOfStop() + " z " + e.getNameAirportOfStart()));

    }
}

