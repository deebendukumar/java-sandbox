package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AvgOfNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Double average = list.stream().mapToInt( i -> i).average().getAsDouble();
        System.out.println("Average: " + average);
    }
}
