package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String toLowerCase = sentence.toLowerCase();
        Map<String, Integer> res = new TreeMap<>();
        StringTokenizer tk = new StringTokenizer(toLowerCase, " ,.!?");
        while(tk.hasMoreTokens()) {
            String token = tk.nextToken();
            if(res.containsKey(token))
                res.put(token, res.get(token) + 1);
            else
                res.put(token, 1);
        }
        return res;
    }
}
