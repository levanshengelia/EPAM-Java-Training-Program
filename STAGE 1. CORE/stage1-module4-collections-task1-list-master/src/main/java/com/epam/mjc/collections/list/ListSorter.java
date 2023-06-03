package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }

    class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            int fx = 5 * x * x + 3;
            int fy = 5 * y * y + 3;
            if (fx != fy) {
                return Integer.compare(fx, fy);
            } else {
                return Integer.compare(x, y);
            }
        }
    }
}