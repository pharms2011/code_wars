package com.inertia.integers;

public class TrailingZeros {
    public static int zeros(int n) {
        // your beatiful code here
        int twos = n/2;
        int fives = n/5;
        for(int j=2; power(2,j)<=n; j++){
            twos+=n/power(2,j);
        }
        for(int j=2; power(5,j)<=n; j++){
            fives+=n/power(5,j);
        }

        return twos>fives? fives: twos;
    }

    public static int power(int i, int p){
        int result = 1;
        for(int j=1; j<=p; j++){
            result*=i;
        }
        return result;
    }
}
