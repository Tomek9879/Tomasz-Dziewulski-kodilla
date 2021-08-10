package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreShow {
    public static void main(String [] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> mapaMovieStore = movieStore.getMovies();

        String nazwa=  mapaMovieStore.entrySet().stream().map(e->e.getValue()).map(e->e.get(0)+"-"+e.get(1)).collect(Collectors.joining("!","",""));
        System.out.println(nazwa);
    }
}

