package com.inertia.strings;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        String lowerCaseText = text.toLowerCase();
        Set preCount = new HashSet();
        Set count = new HashSet();
        for(int i=0; i<lowerCaseText.length(); i++){
            if(preCount.contains(lowerCaseText.charAt(i))){
                count.add(lowerCaseText.charAt(i));
            }
            preCount.add(lowerCaseText.charAt(i));
        }
        return count.size();
    }
}
