package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new TreeMap<>();
        for(Integer key : sourceMap.keySet()) {
            String value = sourceMap.get(key);
            if(res.containsKey(value)) {
                if (res.get(value) > key)
                    res.put(value, key);
            } else
                res.put(value, key);
        }
        return res;
    }
}
