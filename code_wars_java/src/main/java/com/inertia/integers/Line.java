package com.inertia.integers;

// The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
// Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
// Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?
// Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.

import java.util.*;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        Map<Integer, Integer> ticketVender = new HashMap<>();
        ticketVender.put(25, 0);
        ticketVender.put(50, 0);
        ticketVender.put(100, 0);
        for (int person : peopleInLine) {
            switch (person) {
                case (25):
                    ticketVender.put(25, ticketVender.get(25) + 1);
                    break;
                case (50):
                    if (ticketVender.get(25) > 1) {
                        ticketVender.put(25, ticketVender.get(25) - 2);
                    } else {
                        return "NO";
                    }
                    ticketVender.put(50, ticketVender.get(50) + 1);
                    break;
                case (100):
                    if (ticketVender.get(50) > 0 && ticketVender.get(25) > 0) {
                        ticketVender.put(25, ticketVender.get(50) - 1);
                        ticketVender.put(25, ticketVender.get(25) - 1);
                    }
                    else if(ticketVender.get(25) > 2){
                        ticketVender.put(25, ticketVender.get(25) - 3);
                    }
                    else{
                        return "NO";
                    }
                    ticketVender.put(100, ticketVender.get(100) + 1);
                    break;
            }
        }
        return "YES";
    }
}
