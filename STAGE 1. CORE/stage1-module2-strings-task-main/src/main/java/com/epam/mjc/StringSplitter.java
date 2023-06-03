package com.epam.mjc;

import java.util.*;

public class StringSplitter {

    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = delimiters.iterator();
        while(it.hasNext()) {
            sb.append(it.next());
        }
        StringTokenizer st = new StringTokenizer(source, sb.toString());
        while(st.hasMoreTokens()) {
            res.add(st.nextToken());
        }
        return res;
    }
}
