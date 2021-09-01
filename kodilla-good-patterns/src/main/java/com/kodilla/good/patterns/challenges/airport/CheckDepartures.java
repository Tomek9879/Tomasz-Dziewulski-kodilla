 package com.kodilla.good.patterns.challenges.airport;

 public class CheckDepartures {

     public void printDepartures(String nameOfCity) {

        DeparturesRealization departures = new DeparturesRealization();

        departures.departuresRealization().stream().filter(e -> e.getNameAirportOfStart().equals(nameOfCity)).forEach(e -> System.out.println("Lot z " + e.getNameAirportOfStart() + " do " + e.getNameAirportOfStop()));
    }

    public void FlyBy(String nameOfCityStart, String nameOfCityStop) {

        String byAirport;
        boolean directConectionIndicator = false;

        DeparturesRealization departures = new DeparturesRealization();
        ArrivalsRealization arrivals = new ArrivalsRealization();

        for (Fly fly : departures.departuresRealization()) {
            if (fly.getNameAirportOfStart().equals(nameOfCityStart) && fly.getNameAirportOfStop().equals(nameOfCityStop)) {
                System.out.println("Bezpośrednie połączenie: " + fly.getNameAirportOfStart() + " - " + fly.getNameAirportOfStop());
                directConectionIndicator = true;
            }
        }

        if (directConectionIndicator == false) {
            for (Fly fly : departures.departuresRealization()) {
                if (fly.getNameAirportOfStart().equals(nameOfCityStart)) {
                    byAirport = fly.getNameAirportOfStop();
                    for (Fly by : arrivals.arrivalsRealization()) {
                        if (by.getNameAirportOfStart().equals(byAirport) && by.getNameAirportOfStop().equals(nameOfCityStop)) {
                            System.out.println("Połączenie: " + fly.getNameAirportOfStart() + " - " + fly.getNameAirportOfStop() + " Polaczenie z " + by.getNameAirportOfStart() + " - " + by.getNameAirportOfStop());
                        }
                    }
                }
            }
        }
    }
}

