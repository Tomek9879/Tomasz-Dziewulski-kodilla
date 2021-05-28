package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForeCast {
    private Temperatures temperatures;

    public WeatherForeCast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }

    public double getMiddleTemperature() {
        double temperaturesurplus = 0;
        double middleTemperatures = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesurplus = temperaturesurplus + temperature.getValue();


        }
        return middleTemperatures = temperaturesurplus / temperatures.getTemperatures().size();

    }

    public double getMedianTemperatures() {
        ArrayList<Double> sortList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sortList.add(temperature.getValue());

        }
        Collections.sort(sortList);

        double middleTemperature;
        if (sortList.size() % 2 == 0) {
            int halfOfTheList = sortList.size() / 2;
            return middleTemperature = (sortList.get(halfOfTheList - 1) + sortList.get(halfOfTheList)) / 2;

        } else if (sortList.size() % 2 != 0) {
            int halfOfTheList = (sortList.size() / 2);
            return middleTemperature = sortList.get(halfOfTheList);
        }
        return 0;
    }
}
