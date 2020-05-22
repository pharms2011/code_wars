package com.inertia.strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class JadenCaseTest {

    JadenCase jadenCase = new JadenCase();

    @Test
    public void test1(){
        String jadenPhrase = jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real");
        assertEquals("How Can Mirrors Be Real If Our Eyes Aren't Real", jadenPhrase);
    }

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
    }

}