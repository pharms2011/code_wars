package com.inertia.challenges.weekly;

import java.util.Collections;
import java.util.Objects;

public class Week02 {
    public static int nthPower(int[] array, int n) {
        if(Objects.nonNull(array) && n < 0 && array.length > n){
            return (int) Math.pow(array[n],n);
        }
        return -1;
    }
// Favorite Answer
//    public static int nthPower(int[] array, int n) {
//        return n >= array.length ? -1 : (int) Math.pow(array[n], n);
//    }
}
