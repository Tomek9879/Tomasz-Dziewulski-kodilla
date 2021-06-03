package com.kodilla.stream.array;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public class ArrayOperationsClass implements ArrayOperations {


    @Override
    public double getAverage(int[] numbers) {

        IntStream.range(0,numbers.length).forEach(n->System.out.println(numbers[n]));


        OptionalDouble wynikk=IntStream.range(0,numbers.length).map(n->numbers[n]).average();


       if(wynikk.isPresent())
            return wynikk.getAsDouble();
       else return 0;



    }

}
