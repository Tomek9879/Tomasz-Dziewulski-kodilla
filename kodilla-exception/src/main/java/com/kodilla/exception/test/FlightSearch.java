package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
  public Boolean findFilght(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> mapaLotnisk = new HashMap<>();


        String nazwaLotniska1=flight.getArrivalAirport();
        mapaLotnisk.put("Warszawa",true);
        mapaLotnisk.put("Londyn",true);
        mapaLotnisk.put("Paryż",true);
        mapaLotnisk.put("Rzym",true);
        mapaLotnisk.put("Krakow",true);
        mapaLotnisk.put("Madryt",true);

        for(Map.Entry<String,Boolean> entry :mapaLotnisk.entrySet()) {
            if (entry.getKey().equals(nazwaLotniska1)) {
                return entry.getValue();
            } else
                throw new RouteNotFoundException();

        }
             return null;
   }
public static void main(String args[]) {
   // funkcja findFlight przyjmwuje stworzony obiekt lot1 klasy flight nastepnie pobiera z obiektu lotnisko arrivalAirport i sprawdza czy istnieje
   // możliwość londowania na tym lotnu.
    Flight lot1 = new Flight("Warszawa", "Krakow");


     FlightSearch flightSearch = new FlightSearch();

    try {
        Boolean dostepnoscLotu = flightSearch.findFilght(lot1);
    } catch (RouteNotFoundException e) {
        System.out.println("Błąd : Danego lotniska nie ma w systemie");

    }

}
}
