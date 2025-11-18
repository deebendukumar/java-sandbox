package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 15);
        //find out odd and even numbers from the list
        System.out.println("Even Numbers:");
        List<Integer> even = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> odd = list.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
    }
}
