package com.inertia.integers;

import java.util.*;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        List<Integer> elementsList = new ArrayList();
        Map countMap = new HashMap<Integer, Integer>();
        for (int i : elements) {
            int count = (1);
            if (countMap.containsKey(i)) {
                count = (int) countMap.get(i) + 1;

            }
            countMap.put(i, count);
            if (!(count > maxOccurrences)) {
                elementsList.add(i);
            }
        }
        int[] result = elementsList.stream().mapToInt(i -> i).toArray();
        return result;
    }

}
