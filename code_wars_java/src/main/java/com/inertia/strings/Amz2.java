package com.inertia.strings;

import java.util.ArrayList;
import java.util.List;

public class Amz2 {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<Integer> lengthEachScene(List<Character> inputList)
    {
        // WRITE YOUR CODE HERE
        List result = new ArrayList();
        for(int i=0; i<inputList.size(); i++){
            int lastIndex = inputList.lastIndexOf(inputList.get(i));
            for(int j=0; j<lastIndex; j++){
                if(inputList.lastIndexOf(inputList.get(j))>lastIndex){
                    lastIndex=inputList.lastIndexOf(inputList.get(j));
                }
            }
            result.add(lastIndex-i+1);
            i=lastIndex;
        }
        return result;
    }
    // METHOD SIGNATURE ENDS
}
