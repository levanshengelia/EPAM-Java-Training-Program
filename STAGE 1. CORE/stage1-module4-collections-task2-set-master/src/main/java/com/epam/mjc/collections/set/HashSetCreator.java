package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();
        for(int i = 0; i < sourceList.size(); i++) {
            int num = sourceList.get(i);
            if(num % 2 == 1) {
                res.add(num);
                res.add(2 * num);
            } else {
                while(true) {
                    res.add(num);
                    if(num % 2 == 1) break;
                    num /= 2;
                }
            }
        }
        return res;
    }
}
