package com.inertia.daily;

import java.util.*;

/*
* In this kata you have to create all permutations of an input string and remove duplicates, if present. This means, you
* have to shuffle all letters from the input in all possible orders.
* */

public class Day1 {

    public static String pigIt(String str) {
        // Write code here
        String pigLatin= "";
        String[] words= str.split(" ");
        int i=0;
        for(; i<words.length-1;i++){
            if(!words[i].toLowerCase().equals(words[i].toUpperCase())){
                String latin = words[i].substring(1)+words[i].charAt(0)+"ay ";
                pigLatin+=latin;
            }else{
                pigLatin+=words[i]+" ";
            }
        }
        if(!words[i].toLowerCase().equals(words[i].toUpperCase())){
            String latin = words[i].substring(1)+words[i].charAt(0)+"ay";
            pigLatin+=latin;
        }else{
            pigLatin+=words[i];
        }
        return pigLatin;
    }
}
