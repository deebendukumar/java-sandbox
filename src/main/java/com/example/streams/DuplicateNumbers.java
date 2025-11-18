package com.example.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void method01(List<Integer> list) {
        //list all duplicate numbers from the list
        list.stream()
                .filter(i -> list.indexOf(i) != list.lastIndexOf(i))
                .distinct()
                .forEach(System.out::println);
    }

    public static void method02(List<Integer> list) {
        //list all duplicate numbers from the list
        list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 20, 30, 1, 2, 3, 4, 5);
    }
}
