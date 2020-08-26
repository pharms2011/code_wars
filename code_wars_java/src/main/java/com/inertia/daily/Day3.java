package com.inertia.daily;

import java.util.ArrayList;
import java.util.List;

public class Day3 {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        ArrayList<String> reducedDir = new ArrayList();
        for(String dir: arr){
            if(reducedDir.contains(opposite(dir))){
                reducedDir.remove(opposite(dir));
            }else {
                reducedDir.add(dir.toUpperCase());
            }

        }
        return toArray(reducedDir);
    }
    public static String opposite(String dir){
        String oppDir = "";
        if(dir.equalsIgnoreCase("NORTH")){
            return "SOUTH";
        }else if(dir.equalsIgnoreCase("SOUTH")){
            return "NORTH";
        }if(dir.equalsIgnoreCase("EAST")){
            return "WEST";
        }if(dir.equalsIgnoreCase("WEST")){
            return "EAST";
        }
        return oppDir;
    }

    public static String[] toArray(List<String> list){
        String[] array = new String[list.size()];
        for(int i =0; i<list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }
}
