package com.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 20, 30, 1, 2, 3, 4, 5);
        //sort numbers in ascending order
        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);

        list.stream()
                .sorted(Collections.reverseOrder()).forEach(System.out::println);

    }
}
