package com.example.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLowestHoghestNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 20, 30, 1, 2, 3, 4, 5);
        //list down second lowest and highest number from the list
        List<Integer> sortedList = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        if (sortedList.size() >= 2) {
            Integer secondLowest = sortedList.get(1);
            Integer secondHighest = sortedList.get(sortedList.size() - 2);
            System.out.println("Second Lowest: " + secondLowest);
            System.out.println("Second Highest: " + secondHighest);
        } else {
            System.out.println("List does not have enough distinct elements.");
        }
    }
}
