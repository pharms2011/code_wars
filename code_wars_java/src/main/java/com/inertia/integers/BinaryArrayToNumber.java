package com.inertia.integers;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        int total =0;
        for(int i = 0; i < binary.size(); i++){
            if(binary.get(i) == 1){
                total += powerOfTwo(binary.size()-i-1);
            }
        }
        return total;
    }

    private static int powerOfTwo(int p){
        int result = 1;
        for(int i=0; i<p; i++){
            result *= 2;
        }
        return result;
    }
}

