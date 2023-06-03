package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for(Integer elem : functionMap.keySet()) {
            if(functionMap.get(elem) == requiredValue) return true;
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> res = new TreeMap<>();
        for(Integer elem : sourceList) {
            res.put(elem, 5 * elem + 2);
        }
        return res;
    }
}
