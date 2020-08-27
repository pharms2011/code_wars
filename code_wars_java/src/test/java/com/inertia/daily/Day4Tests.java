package com.inertia.daily;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class Day4Tests {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", Day4.longToIP(2154959208L));
        assertEquals("0.0.0.0", Day4.longToIP(0));
        assertEquals("128.32.10.1", Day4.longToIP(2149583361L));
    }
}
