package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> res = new ArrayList<>();
        for(String project : projects.keySet()) {
            if(projects.get(project).contains(developer))
                res.add(project);
        }
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int comp = Integer.compare(o2.length(), o1.length());
                if(comp != 0)
                    return comp;
                return o2.compareTo(o1);
            }
        });
        return res;
    }
}
