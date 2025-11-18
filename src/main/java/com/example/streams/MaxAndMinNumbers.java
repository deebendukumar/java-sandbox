package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumbers {

    public static void method01(List<Integer> list) {
        Integer max = list.stream().max(Integer::compareTo).orElse(null);
        Integer min = list.stream().min(Integer::compareTo).orElse(null);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void method02(List<Integer> list) {
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //find out max and min number from the list
        method01(list);
        method02(list);
    }
}
