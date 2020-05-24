package com.inertia.arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if(a.length == 0||(a.length != b.length)) {
            return false;
        }
        int result = 0;
        for(int i: a){
            for(int j =0; j< b.length; j++){
                if(b[j] == (i*i)){
                    result++;
                    b[j] = -1;
                    break;
                }
            }
        }
        return result == a.length;
    }
}
