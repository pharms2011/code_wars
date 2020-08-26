package com.inertia.daily;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Day1Tests {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", Day1.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", Day1.pigIt("This is my string"));
    }
}