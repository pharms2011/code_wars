package com.inertia.challenges.weekly;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week02Test {
    @Test
    public void basicTests() {
        assertEquals(-1, Week02.nthPower(new int[] {1,2}, 2));
        assertEquals(8, Week02.nthPower(new int[] {3,1,2,2}, 3));
        assertEquals(4, Week02.nthPower(new int[] {3,1,2}, 2));
    }
}
