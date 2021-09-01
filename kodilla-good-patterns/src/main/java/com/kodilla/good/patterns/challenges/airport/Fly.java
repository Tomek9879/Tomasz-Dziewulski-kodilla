package com.kodilla.good.patterns.challenges.airport;

import java.util.Objects;

public class Fly {

    private String nameAirportOfStart;
    private String nameAirportOfStop;

    public Fly(String nameAirportOfStart, String nameAirportOfStop) {
        this.nameAirportOfStart = nameAirportOfStart;
        this.nameAirportOfStop = nameAirportOfStop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fly fly = (Fly) o;
        return nameAirportOfStart.equals(fly.nameAirportOfStart) && nameAirportOfStop.equals(fly.nameAirportOfStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAirportOfStart, nameAirportOfStop);
    }

    public String getNameAirportOfStart() {
        return nameAirportOfStart;
    }

    public String getNameAirportOfStop() {
        return nameAirportOfStop;
    }
}
