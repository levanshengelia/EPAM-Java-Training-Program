package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> res = new TreeSet<>();
        for(int i = 0; i < sourceList.size(); i++) {
            res.add(sourceList.get(i) * sourceList.get(i));
        }
        NavigableSet<Integer> subset = res.subSet(lowerBound, true, upperBound, true);
        return subset;
    }
}
