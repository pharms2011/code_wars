package com.inertia.integers;

public class Square {
    public static boolean isSquare(int n) {
        if(n==0){
            return true;
        }
        for( int i =1; i<=Math.sqrt(n); i++){
            if(i*i == n){
                return true;
            }
        }
        return false; // fix me!
    }
}
