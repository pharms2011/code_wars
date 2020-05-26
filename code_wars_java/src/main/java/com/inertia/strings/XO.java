package com.inertia.strings;

public class XO {

    public static boolean getXO(String str) {

        // Good Luck!!
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='x' || str.charAt(i)=='X'){
                xCount++;
            }
            if(str.charAt(i)=='o' || str.charAt(i)=='O'){
                oCount++;
            }
        }
        return xCount == oCount;
    }
}