package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> lst = new ArrayList<>(list);
              for(int i = 0; i < lst.size(); i++) {
                  lst.set(i, lst.get(i) / divider);
              }
              return lst;
        };
    }
}
