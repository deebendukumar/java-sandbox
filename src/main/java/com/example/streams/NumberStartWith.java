package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 200, 234, 234, 300, 301, 304, 500, 285);

        //list all number starting with 2
        List<Integer> l = list.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
