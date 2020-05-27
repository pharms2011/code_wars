package com.inertia.strings;

// Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.
// This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!
// All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
// What is considered Valid?
// A string of braces is considered valid if all braces are matched with the correct brace.

import java.util.*;

public class BraceChecker {

    public boolean isValid(String braces) {
        if(Objects.isNull(braces) || braces.length()%2 != 0){
            return false;
        }
        // Add code here
        List leftBrackets = new ArrayList<Character>();
        leftBrackets.add('{');
        leftBrackets.add('(');
        leftBrackets.add('[');
        List rightBrackets = new ArrayList<Character>();
        rightBrackets.add('}');
        rightBrackets.add(')');
        rightBrackets.add(']');
        Map bracketPairs = new HashMap();
        bracketPairs.put(')','(');
        bracketPairs.put(']','[');
        bracketPairs.put('}','{');
        Stack state = new Stack();
        for(int i=0; i<braces.length(); i++){
            Character currentChar = braces.charAt(i);
            if(leftBrackets.contains(currentChar)){
                state.push(currentChar);
            }
            if(rightBrackets.contains(currentChar)){
                if(state.isEmpty()){
                    return false;
                }
                Character pair = (Character) state.pop();
                if(bracketPairs.get(currentChar) != pair){
                    return false;
                }
            }
        }
        return state.isEmpty();
    }

}
