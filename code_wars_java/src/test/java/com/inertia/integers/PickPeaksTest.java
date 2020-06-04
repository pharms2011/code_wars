package com.inertia.integers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

import java.util.*;
import java.util.stream.Collectors;

public class PickPeaksTest {
    private static String[] msg = {"should support finding peaks",
            "should support finding peaks, but should ignore peaks on the edge of the array",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks, but should ignore peaks on the edge of the array"};

    private static int[][] array = {{1, 2, 3, 6, 4, 1, 2, 3, 2, 1},
            {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3},
            {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1},
            {2, 1, 3, 1, 2, 2, 2, 2, 1},
            {2, 1, 3, 1, 2, 2, 2, 2}};

    private static int[][] posS = {{3, 7},
            {3, 7},
            {3, 7, 10},
            {2, 4},
            {2},};

    private static int[][] peaksS = {{6, 3},
            {6, 3},
            {6, 3, 2},
            {3, 2},
            {3}};

    @Test
    public void sampleTest1() {
        final int[] p1 = posS[0], p2 = peaksS[0];
        Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {{
            put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
            put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
        }},
                actual = PickPeaks.getPeaks(array[0]);
        assertEquals(msg[0], expected, actual);
    }

    @Test
    public void sampleTest2() {
        final int[] p1 = posS[2], p2 = peaksS[2];
        Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {{
            put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
            put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
        }},
                actual = PickPeaks.getPeaks(array[2]);
        assertEquals(msg[2], expected, actual);
    }

    @Test
    public void sampleTest3() {
        final int[] p1 = posS[3], p2 = peaksS[3];
        Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {{
            put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
            put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
        }},
                actual = PickPeaks.getPeaks(array[3]);
        assertEquals(msg[3], expected, actual);
    }

    @Test
    public void sampleTest4() {
        final int[] p1 = posS[4], p2 = peaksS[4];
        Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {{
            put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
            put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
        }},
                actual = PickPeaks.getPeaks(array[4]);
        for(int i: array[4]){
            System.out.print(array[4][i]);
        }
        assertEquals(msg[4], expected, actual);
    }

    @Test
    public void sampleTest5() {
        final int[] p1 = posS[1], p2 = peaksS[1];
        Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {{
            put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
            put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
        }},
                actual = PickPeaks.getPeaks(array[1]);
        assertEquals(msg[1], expected, actual);
    }
}
