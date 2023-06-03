package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return list -> {
            for (String str : list) {
                if (!Character.isUpperCase(str.charAt(0))) {
                    return false;
                }
            }
            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return list -> {
            List<Integer> evenValues = new ArrayList<>();
            for(Integer elem : list) {
                if(elem % 2 == 0)
                    evenValues.add(elem);
            }
            list.addAll(evenValues);
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> res = new ArrayList<>();
            for(String elem : values) {
                if(Character.isUpperCase(elem.charAt(0)) && elem.charAt(elem.length() - 1) == '.' &&
                    elem.split(" ").length > 3)
                    res.add(elem);
            }
            return res;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return list -> {
            Map<String, Integer> res = new HashMap<>();
            for(String elem : list) {
                res.put(elem, elem.length());
            }
            return res;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> res = new ArrayList<>(list1);
            res.addAll(list2);
            return res;
        };
    }
}
