package com.kodilla.good.patterns.challenges.airport;

import java.util.*;

public class ArrivalsRealization {

    public Set<Fly> arrivalsRealization() {

        Set<Fly> lisfFlyToAirport = new HashSet<>();

        Fly lotFormGdansk0 = new Fly("Warszawa", "Gdansk");
        Fly lotFormGdansk1 = new Fly("Poznan", "Gdansk");
        Fly lotFormGdansk2 = new Fly("Krakow", "Gdansk");

        Fly lotFormWarszawa0 = new Fly("Gdansk", "Warszawa");
        Fly lotFormWarszawa1 = new Fly("Poznan", "Warszawa");
        Fly lotFormWarszawa2 = new Fly("Krakow", "Warszawa");
        Fly lotFormWarszawa3 = new Fly("Wroclaw", "Warszawa");

        Fly lotFormPoznan0 = new Fly("Gdansk", "Poznan");
        Fly lotFormPoznan1 = new Fly("Warszawa", "Poznan");
        Fly lotFormPoznan2 = new Fly("Krakow", "Poznan");
        Fly lotFormPoznan3 = new Fly("Wroclaw", "Poznan");

        Fly lotFormKrakow0 = new Fly("Gdansk", "Krakow");
        Fly lotFormKrakow1 = new Fly("Poznan", "Krakow");
        Fly lotFormKrakow2 = new Fly("Warszawa", "Krakow");
        Fly lotFormKrakow3 = new Fly("Wroclaw", "Krakow");

        Fly lotFormWroclaw0 = new Fly("Poznan", "Wroclaw");
        Fly lotFormWroclaw1 = new Fly("Krakow", "Wroclaw");
        Fly lotFormWroclaw2 = new Fly("Warszawa", "Wroclaw");

        lisfFlyToAirport.add(lotFormGdansk0);
        lisfFlyToAirport.add(lotFormGdansk1);
        lisfFlyToAirport.add(lotFormGdansk2);

        lisfFlyToAirport.add(lotFormWarszawa0);
        lisfFlyToAirport.add(lotFormWarszawa1);
        lisfFlyToAirport.add(lotFormWarszawa2);
        lisfFlyToAirport.add(lotFormWarszawa3);

        lisfFlyToAirport.add(lotFormPoznan0);
        lisfFlyToAirport.add(lotFormPoznan1);
        lisfFlyToAirport.add(lotFormPoznan2);
        lisfFlyToAirport.add(lotFormPoznan3);

        lisfFlyToAirport.add(lotFormKrakow0);
        lisfFlyToAirport.add(lotFormKrakow1);
        lisfFlyToAirport.add(lotFormKrakow2);
        lisfFlyToAirport.add(lotFormKrakow3);

        lisfFlyToAirport.add(lotFormWroclaw0);
        lisfFlyToAirport.add(lotFormWroclaw1);
        lisfFlyToAirport.add(lotFormWroclaw2);

        return lisfFlyToAirport;

    }
}


