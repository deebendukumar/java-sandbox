package com.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 20, 30, 1, 2, 3, 4, 5);
        //get first 5 numbers from the list
        List<Integer> limitedList = list.stream()
                .limit(5)
                .collect(Collectors.toList());

        list.stream()
                .limit(5)
                .forEach(System.out::println);

        //skip first 5 numbers from the list
        List<Integer> skippedList = list.stream()
                .skip(5)
                .collect(Collectors.toList());
    }
}
