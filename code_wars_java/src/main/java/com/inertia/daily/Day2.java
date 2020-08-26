package com.inertia.daily;

import java.util.Arrays;
import java.util.List;

public class Day2 {
    public static int parseInt(String numStr) {
        // Your code here!
        int total = 0;
        List ones = Arrays.asList("nine","eight","seven","six","five","four","three","two","one","zero");
        List tensPlace = Arrays.asList("ten", "twenty", "thirty","forty", "fifty", "sixty", "seventy", "eighty", "ninety");
        List tens = Arrays.asList("eleven", "twelve", "thirteen","fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
        List multiple = Arrays.asList("hundred", "thousand", "million");
        String[] numbers = numStr.split(" ");
        int offset = 0;
        for(int i =0; i < numbers.length; i++ ){
            String num = numbers[i];
            if(ones.contains(num)){
                total += convertOnes(num);
            }else if(tensPlace.contains(num)){
                total += convertTensPlace(num);
            }
            else if(tens.contains(num)){
                total += convertTens(num);
            }else if(multiple.contains(num)){
                total += parseInt(numbers[i-1]) * convertMultiple(num);
                offset += parseInt(numbers[i-1]);
            }else{
                total += convertMix(num);
            }
        }
        return total-offset;
    }

    private static int convertOnes(String str){
        switch(str){
            case("one"):
                return 1;
            case("two"):
                return 2;
            case("three"):
                return 3;
            case("six"):
                return 6;
            case("four"):
                return 4;
            case("five"):
                return 5;
            case("seven"):
                return 7;
            case("eight"):
                return 8;
            case("nine"):
                return 9;
            case("zero"):
                return 0;
        }
        return -1;
    }
    private static int convertTensPlace(String str){
        switch(str){
            case("ten"):
                return 10;
            case("twenty"):
                return 20;
            case("thirty"):
                return 30;
            case("sixty"):
                return 60;
            case("forty"):
                return 40;
            case("fifty"):
                return 50;
            case("seventy"):
                return 70;
            case("eighty"):
                return 80;
            case("ninety"):
                return 90;
        }
        return -1;

    }
    private static int convertTens(String str){
        switch(str){
            case("eleven"):
                return 11;
            case("twelve"):
                return 12;
            case("thirteen"):
                return 13;
            case("fourteen"):
                return 14;
            case("fifteen"):
                return 15;
            case("sixteen"):
                return 16;
            case("seventeen"):
                return 17;
            case("eighteen"):
                return 18;
            case("nineteen"):
                return 19;
        }
        return -1;

    }
    private static int convertMix(String str){
        String tens = str.split("-")[0];
        String ones = str.split("-")[1];
        return convertTensPlace(tens)+convertOnes(ones);
    }
    private static int convertMultiple(String str){
        switch(str){
            case("hundred"):
                return 100;
            case("thousand"):
                return 1000;
            case("million"):
                return 1000000;
        }
        return -1;
    }
}
