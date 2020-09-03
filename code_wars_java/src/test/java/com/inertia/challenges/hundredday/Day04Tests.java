package com.inertia.challenges.hundredday;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day04Tests {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", Day04.longToIP(2154959208L));
        assertEquals("0.0.0.0", Day04.longToIP(0));
        assertEquals("128.32.10.1", Day04.longToIP(2149583361L));
    }
}
