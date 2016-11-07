package com.ddubson.example.lambda;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: ddubson
 */
public class ListSort {
    public static List<String> sortByLength(List<String> input) {
        return input
                .stream()
                .sorted((s1, s2) -> s1.length() > s2.length() ? 1 : -1)
                .collect(Collectors.toList());
    }
}
