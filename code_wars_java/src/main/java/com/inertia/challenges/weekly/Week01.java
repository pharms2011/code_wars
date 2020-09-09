package com.inertia.challenges.weekly;

import java.util.ArrayList;
import java.util.List;

public class Week01 {
    public static String[] wave(String str) {
        // Your code here
        List<String> waves = new ArrayList<String>();
        for(int i = 0; i < str.length(); i++){
            String cap = str.substring(i,i+1).toUpperCase();
            if(cap.toLowerCase() != cap.toUpperCase()){
                waves.add(str.substring(0,i).toLowerCase()+ cap + str.substring(i+1,str.length()).toLowerCase());
            }
        }
        return waves.stream().toArray(String[]::new);
    }
}

// Favorite Answer
//import java.util.stream.IntStream;
//
//public class MexicanWave {
//
//    public static String[] wave(String str) {
//        return IntStream
//                .range(0, str.length())
//                .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
//                .filter(x -> !x.equals(str))
//                .toArray(String[]::new);
//    }
//
//}