package com.inertia.challenges.hundredday;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day05Tests {
    private Day05.Result loss = Day05.Result.LOSS;
    private Day05.Result win = Day05.Result.WIN;
    private Day05.Result tie = Day05.Result.TIE;

    @Test
    public void PokerHandRankingTest()
    {
        Test("Highest straight flush wins",        loss, "2H 3H 4H 5H 6H", "KS AS TS QS JS");
        Test("Straight flush wins of 4 of a kind", win,  "2H 3H 4H 5H 6H", "AS AD AC AH JD");
        Test("Highest 4 of a kind wins",           win,  "AS AH 2H AD AC", "JS JD JC JH 3D");
        Test("4 Of a kind wins of full house",     loss, "2S AH 2H AS AC", "JS JD JC JH AD");
        Test("Full house wins of flush",           win,  "2S AH 2H AS AC", "2H 3H 5H 6H 7H");
        Test("Highest flush wins",                 win,  "AS 3S 4S 8S 2S", "2H 3H 5H 6H 7H");
        Test("Flush wins of straight",             win,  "2H 3H 5H 6H 7H", "2S 3H 4H 5S 6C");
        Test("Equal straight is tie", 	  	       tie,  "2S 3H 4H 5S 6C", "3D 4C 5H 6H 2S");
        Test("Straight wins of three of a kind",   win,  "2S 3H 4H 5S 6C", "AH AC 5H 6H AS");
        Test("3 Of a kind wins of two pair",       loss, "2S 2H 4H 5S 4C", "AH AC 5H 6H AS");
        Test("2 Pair wins of pair",                win,  "2S 2H 4H 5S 4C", "AH AC 5H 6H 7S");
        Test("Highest pair wins",                  loss, "6S AD 7H 4S AS", "AH AC 5H 6H 7S");
        Test("Pair wins of nothing",               loss, "2S AH 4H 5S KC", "AH AC 5H 6H 7S");
        Test("Highest card loses",                 loss, "2S 3H 6H 7S 9C", "7H 3C TH 6H 9S");
        Test("Highest card wins",                  win,  "4S 5H 6H TS AC", "3S 5H 6H TS AC");
        Test("Equal cards is tie",		             tie,  "2S AH 4H 5S 6C", "AD 4C 5H 6H 2C");
    }

    private void Test(String description, Day05.Result expected, String playerHand, String opponentHand)
    {
        Day05 player = new Day05(playerHand);
        Day05 opponent = new Day05(opponentHand);
        assertEquals(description + ":", expected, player.compareWith(opponent));
    }
}
