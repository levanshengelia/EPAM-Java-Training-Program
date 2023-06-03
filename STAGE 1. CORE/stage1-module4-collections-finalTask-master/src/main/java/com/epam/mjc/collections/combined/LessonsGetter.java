package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> res = new HashSet<>();
        for(String weekday : timetable.keySet()) {
            for(String lesson : timetable.get(weekday))
                res.add(lesson);
        }
        return res;
    }
}
