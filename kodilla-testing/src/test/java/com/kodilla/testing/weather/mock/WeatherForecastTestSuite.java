package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.WeatherForeCast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForeCast weatherForeCast = new WeatherForeCast(temperaturesMock);

        //When
        int quantityOfSensor = weatherForeCast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensor);
    }


    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testGetMiddleTemperature() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForeCast weatherForeCast = new WeatherForeCast(temperaturesMock);

        //When
        double expectTemperatures = (25.5 + 26.2 + 24.8 + 25.2 + 26.1) / 5;
        double round = expectTemperatures;
        round *= 100;
        round = Math.round(round);
        round /= 100;
        expectTemperatures = round;

        double middleTemperature = weatherForeCast.getMiddleTemperature();

        //Then
        Assertions.assertEquals(expectTemperatures, middleTemperature);
    }

    //test wyznaczania mediany dla nieparzystej liczby temperatur
    @Test
    void testGetMedianTemperature() {

        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForeCast weatherForeCast = new WeatherForeCast(temperaturesMock);

        //When
        double medianTemperatures = weatherForeCast.getMedianTemperatures();

        //Then
        Assertions.assertEquals(25.5, medianTemperatures);


    }

    //test wyznaczania mediany dla parzystej liczby temperatur
    @Test
    void testGetMedianTemperatureEven() {

        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForeCast weatherForeCast = new WeatherForeCast(temperaturesMock);

        //When
        double medianTemperatures = weatherForeCast.getMedianTemperatures();

        //Then
        Assertions.assertEquals(25.35, medianTemperatures);


    }
}
