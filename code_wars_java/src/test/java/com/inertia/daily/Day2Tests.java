package com.inertia.daily;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Day2Tests {

    @Test
    public void fixedTests() {
//        assertEquals(11 , Day2.parseInt("eleven"));
//        assertEquals(20 , Day2.parseInt("twenty"));
        assertEquals(69978 , Day2.parseInt("sixty nine thousand nine hundred seventy eight"));
    }
}
