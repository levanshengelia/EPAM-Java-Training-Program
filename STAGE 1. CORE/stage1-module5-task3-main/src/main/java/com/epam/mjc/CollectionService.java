package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(elem -> elem % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(elem -> elem.toUpperCase())
                .collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(l -> l.stream())
                .min(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.compare(o1, o2);
                    }
                });
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce((arg1, arg2) -> arg1 + arg2).get();
    }
}
