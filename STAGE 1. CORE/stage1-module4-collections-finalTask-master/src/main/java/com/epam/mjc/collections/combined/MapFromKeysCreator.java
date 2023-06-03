package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> res = new HashMap<>();
        for(String key : sourceMap.keySet()) {
            if(!res.containsKey(key.length())) {
                res.put(key.length(), new HashSet<>());
            }
            res.get(key.length()).add(key);
        }
        return res;
    }
}
