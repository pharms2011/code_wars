package com.inertia.strings;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Amz2Test {
    @Test
    public void test1(){
        Amz2 amz2 = new Amz2();
        List testData = new ArrayList();
        testData.add('a');
        testData.add('b');
        testData.add('c');
        testData.add('d');
        testData.add('a');
        testData.add('e');
        testData.add('f');
        testData.add('g');
        testData.add('h');
        testData.add('i');
        testData.add('j');
        testData.add('e');
        List expected = new ArrayList();
        expected.add(5);
        expected.add(7);
        assertEquals(expected, amz2.lengthEachScene(testData));
    }
}
