package com.kodilla.good.patterns.challenges.airport;

import java.util.*;

public class DeparturesRealization {

    public Set<Fly> departuresRealization() {

        Set<Fly> lisfFlyFromAirport = new HashSet<>();

        Fly lotFormGdansk0 = new Fly("Gdansk", "Warszawa");
        Fly lotFormGdansk1 = new Fly("Gdansk", "Poznan");
        Fly lotFormGdansk2 = new Fly("Gdansk", "Krakow");

        Fly lotFormWarszawa0 = new Fly("Warszawa", "Gdansk");
        Fly lotFormWarszawa1 = new Fly("Warszawa", "Poznan");
        Fly lotFormWarszawa2 = new Fly("Warszawa", "Krakow");
        Fly lotFormWarszawa3 = new Fly("Warszawa", "Wroclaw");

        Fly lotFormPoznan0 = new Fly("Poznan", "Gdansk");
        Fly lotFormPoznan1 = new Fly("Poznan", "Warszawa");
        Fly lotFormPoznan2 = new Fly("Poznan", "Krakow");
        Fly lotFormPoznan3 = new Fly("Poznan", "Wroclaw");

        Fly lotFormKrakow0 = new Fly("Krakow", "Gdansk");
        Fly lotFormKrakow1 = new Fly("Krakow", "Poznan");
        Fly lotFormKrakow2 = new Fly("Krakow", "Warszawa");
        Fly lotFormKrakow3 = new Fly("Krakow", "Wroclaw");

        Fly lotFormWroclaw0 = new Fly("Wroclaw", "Poznan");
        Fly lotFormWroclaw1 = new Fly("Wroclaw", "Krakow");
        Fly lotFormWroclaw2 = new Fly("Wroclaw", "Warszawa");

        lisfFlyFromAirport.add(lotFormGdansk0);
        lisfFlyFromAirport.add(lotFormGdansk1);
        lisfFlyFromAirport.add(lotFormGdansk2);

        lisfFlyFromAirport.add(lotFormWarszawa0);
        lisfFlyFromAirport.add(lotFormWarszawa1);
        lisfFlyFromAirport.add(lotFormWarszawa2);
        lisfFlyFromAirport.add(lotFormWarszawa3);

        lisfFlyFromAirport.add(lotFormPoznan0);
        lisfFlyFromAirport.add(lotFormPoznan1);
        lisfFlyFromAirport.add(lotFormPoznan2);
        lisfFlyFromAirport.add(lotFormPoznan3);

        lisfFlyFromAirport.add(lotFormKrakow0);
        lisfFlyFromAirport.add(lotFormKrakow1);
        lisfFlyFromAirport.add(lotFormKrakow2);
        lisfFlyFromAirport.add(lotFormKrakow3);

        lisfFlyFromAirport.add(lotFormWroclaw0);
        lisfFlyFromAirport.add(lotFormWroclaw1);
        lisfFlyFromAirport.add(lotFormWroclaw2);

        return lisfFlyFromAirport;
    }
}
