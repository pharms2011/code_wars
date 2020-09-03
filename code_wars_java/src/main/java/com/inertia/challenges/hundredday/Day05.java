package com.inertia.challenges.hundredday;

import java.util.ArrayList;
import java.util.List;

public class Day05 {
    public String getHand() {
        return hand;
    }

    public enum Result { TIE, WIN, LOSS }

    private String hand;

    Day05(String hand)
    {
        this.hand = hand;
    }

    public Result compareWith(Day05 hand) {
        List<Card> myHand = new ArrayList<>();
        List<Card> opHand = new ArrayList<>();
        for(String card: getHand().split(" ")){
            Card newCard = new Card(card.substring(0,1), card.substring(1,2));
            System.out.println(newCard);
                myHand.add(newCard);
        }
        for(String card: hand.getHand().split(" ")){
            Card newCard = new Card(card.substring(0,1), card.substring(1,2));
            myHand.add(newCard);
        }

        return Result.TIE;
    }

    private int getBestHandScore(List<Card> cards) {
        boolean sameSuit;
        List<String> values = new ArrayList<>();
        List<String> suites = new ArrayList<>();
        for(Card card: cards){
            values.add(card.value);
            suites.add(card.suite);
        }
        String same = suites.get(0);
        int sameCount = 0;
        for(String suite: suites){
            if(suite.equalsIgnoreCase(same)){
                sameCount++;
            }
        }
        if(sameCount== suites.size()){
            sameSuit = true;
        }
        boolean flush = false;
        for(String value: values){

        }
        return 10;
    }

    public class Card{
        public String suite;
        public String value;

        Card (String value, String suite){
            this.suite = suite;
            this.value = value;
        }

        @Override
        public String toString(){
            String suite = "";
            String value = "";
            switch(this.suite){
                case("S"):
                    suite = "Spades";
                    break;
                case("D"):
                    suite = "Diamonds";
                    break;
                case("H"):
                    suite = "Hearts";
                    break;
                case("C"):
                    suite = "Clubs";
                    break;
            }

            switch(this.value){
                case("K"):
                    value = "King";
                    break;
                case("Q"):
                    value = "Queen";
                    break;
                case("J"):
                    value = "Jack";
                    break;
                case("A"):
                    value = "Ace";
                    break;
                default:
                    value = this.value;
            }
            return "The " + value + " of " + suite;
        }
    }

    List<Integer> valuesToInt(List<String> values){
        List<Integer> result = new ArrayList<>();
        for(String value: values){
            switch(value){
                case("K"):
                    result.add(13);
                    break;
                case("Q"):
                    result.add(12);
                    break;
                case("J"):
                    result.add(11);
                    break;
                case("A"):
                    result.add(14);
                    break;
//                default:
//                    result = value;
            }
        }
        return result;
    }
}
