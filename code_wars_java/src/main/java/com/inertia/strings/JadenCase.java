package com.inertia.strings;

import java.util.Objects;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if(Objects.isNull(phrase)){
            return null;
        }
        else if(phrase.equals("")){
            return null;
        }
        StringBuilder jadenPhrase = new StringBuilder();
        for(String str: phrase.split(" ")){
            jadenPhrase.append(str.substring(0,1).toUpperCase()+str.substring(1)+" ");
        }
        return jadenPhrase.toString().trim();
    }

}