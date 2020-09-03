package com.inertia.challenges.hundredday;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Day01Tests {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", Day01.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", Day01.pigIt("This is my string"));
    }
}