package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class MovieStoreShow {
    public static void main(String [] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> mapaMovieStore = movieStore.getMovies();

        mapaMovieStore.entrySet().stream().filter(e->e.getKey().equals("IM")|| e.getKey().equals("AV")).map(e->e.getValue()+"!").forEach(System.out::print);
        mapaMovieStore.entrySet().stream().filter(e->e.getKey().equals("FL")).forEach(System.out::print)
    }
}

