package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testUpdate(){

        Student Janek_Kowalski = new Student("Janek Kowalski");
        Student Dorota_Strzała = new Student("Dorota Strzała");
        Student Marlena_Nowak = new Student("Marlena Nowak");
        Student Marek_Janecki = new Student("Marek Janecki");

        Mentor Adrian_Zambrowski = new Mentor("Adrian Zambrowski");
        Mentor Monika_Chrzanowska = new Mentor("Monika Chrzanowska");

        Janek_Kowalski.registerObserver(Adrian_Zambrowski);
        Dorota_Strzała.registerObserver(Adrian_Zambrowski);

        Marlena_Nowak.registerObserver(Monika_Chrzanowska);
        Marek_Janecki.registerObserver(Monika_Chrzanowska);

        Janek_Kowalski.addExercies("Jak namalować obraz");
        Janek_Kowalski.addExercies("Jak posprzątać samochód");

        Dorota_Strzała.addExercies("Napisać wypracowanie w wordPadzie");

        Marlena_Nowak.addExercies("Zrobić wykresy z prezentacji w exelu");

        Marek_Janecki.addExercies("Opracować nowe podejście do strategi przekazywania informacji");


        assertEquals(3, Adrian_Zambrowski.getUpdateCount());
        assertEquals(2, Monika_Chrzanowska.getUpdateCount());

    }
}
