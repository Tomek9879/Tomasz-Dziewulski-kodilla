package com.kodilla.good.patterns.challenges.airport;

import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        CheckDepartures checkDepartures = new CheckDepartures();
        checkDepartures.printDepartures("Warszawa");

        CheckArrivals checkArrivals = new CheckArrivals();
        checkArrivals.printArrivals("Gdansk");

        checkDepartures.FlyBy("Gdansk", "Wroclaw");

    }
}
