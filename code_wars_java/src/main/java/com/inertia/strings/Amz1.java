package com.inertia.strings;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED

public class Amz1 {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public ArrayList<String> popularNToys(int numToys,
                                          int topToys,
                                          List<String> toys,
                                          int numQuotes,
                                          List<String> quotes){
        // WRITE YOUR CODE HERE
        ArrayList<String> topToysList = new ArrayList<>();
        Map toyCounts = new HashMap<String, Integer>();
        for(String quote: quotes){
            // Scan the quote for each toy
            for(String toy: toys){
                for(String quoteWord: quote.replace(",", "").split(" ")){
                    if(quoteWord.equalsIgnoreCase(toy)){
                        if(!toyCounts.containsKey(toy)){
                            toyCounts.put(toy, 1);
                        }
                        else{
                            toyCounts.put(toy, (Integer)toyCounts.get(toy)+1);
                        }
                    }
                }
            }
        }
        System.out.println(toyCounts);
        for(int i =0; i<topToys; i++){
            String max = "";
            int maxCount = -1;
            List orderedToys = new ArrayList();
            for(String toy: (Set<String>)toyCounts.keySet()){
                orderedToys.add(toy);
            }
            Collections.sort(orderedToys);
            for(String toy: (List<String>)orderedToys){
                if((Integer)toyCounts.get(toy)>maxCount){
                    max = toy;
                    maxCount = (Integer)toyCounts.get(toy);
                }
            }
            topToysList.add(max);
            toyCounts.put(max,-1);
        }
        return topToysList;
    }
    // METHOD SIGNATURE ENDS
}
