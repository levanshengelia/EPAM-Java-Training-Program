package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = 0; i < sourceList.size(); i++) {
            int num = sourceList.get(i);
            if(num % 2 == 0)
                res.addLast(num);
            else
                res.addFirst(num);
        }
        return res;
    }
}
