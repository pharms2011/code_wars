package com.inertia.challenges.weekly;

import java.util.Arrays;

public class Week03 {
    public static int getAverage(int[] marks){
        return Arrays.stream(marks).sum()/marks.length;
    }
//    Favorite Answer
//    public static int getAverage(int[] marks){
//        return (int) Arrays.stream(marks).average().orElse(Double.NaN);
//    }
}
