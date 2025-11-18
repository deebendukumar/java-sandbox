package com.example.streams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);
        // get square of each number and then get number that are greater than 10.
        //and then get the average of those numbers.
        Double average = list.stream()
                .map(i -> i * i) // square each number
                .filter(i -> i > 100) // filter numbers greater than 10
                .filter( i -> i >= 900) // filter numbers greater than or equal to 100
                .mapToInt(i -> i) // convert to IntStream
                .average().getAsDouble();
        System.out.println("Average of squares greater than 10: " + average);
    }
}
