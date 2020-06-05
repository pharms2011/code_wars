package com.inertia.strings;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Amz1Test {

    @Test
    public void test1(){
        Amz1 amz1 = new Amz1();
        List toys = new ArrayList();
        toys.add("anacell");
        toys.add("betacellular");
        toys.add("eurocell");
        List quotes = new ArrayList();
        quotes.add("Best services provided by anacell");
        quotes.add("betacellular has great services");
        quotes.add("anacell provides much better services than all others");
        ArrayList result = amz1.popularNToys(5,2,toys, 3,quotes);
        List solution = new ArrayList();
        solution.add("anacell");
        solution.add("betacellular");
        assertEquals(solution, result);
    }

    @Test
    public void test2(){
        Amz1 amz1 = new Amz1();
        List toys = new ArrayList();
        toys.add("anacell");
        toys.add("betacellular");
        toys.add("eurocell");
        List quotes = new ArrayList();
        quotes.add("Best services provided by anacell");
        quotes.add("betacellular has great services");
        quotes.add("anacell provides much better services than all others");
        ArrayList result = amz1.popularNToys(5,2,toys, 3,quotes);
        List solution = new ArrayList();
        solution.add("anacell");
        solution.add("betacellular");
        assertEquals(solution, result);
    }
}
