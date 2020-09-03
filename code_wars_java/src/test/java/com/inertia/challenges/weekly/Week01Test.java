package com.inertia.challenges.weekly;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.runners.JUnit4;
import java.util.Arrays;

/*
* The wave (known as the Mexican wave in the English-speaking world outside North America) is an example of metachronal
* rhythm achieved in a packed stadium when successive groups of spectators briefly stand, yell, and raise their arms.
* Immediately upon stretching to full height, the spectator returns to the usual seated position.
* The result is a wave of standing spectators that travels through the crowd, even though individual spectators never
* move away from their seats. In many large arenas the crowd is seated in a contiguous circuit all the way around the
* sport field, and so the wave is able to travel continuously around the arena; in discontiguous seating arrangements,
* the wave can instead reflect back and forth through the crowd. When the gap in seating is narrow, the wave can
* sometimes pass through it. Usually only one wave crest will be present at any given time in an arena, although
* simultaneous, counter-rotating waves have been produced. (Source Wikipedia)
* */
public class Week01Test {

    @Test
    public void basicTest1() {
        String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, Week01.wave("hello"));
    }

    @Test
    public void basicTest2() {
        String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, Week01.wave("codewars"));
    }

    @Test
    public void basicTest3() {
        String[] result = new String[] { };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, Week01.wave(""));
    }

    @Test
    public void basicTest4() {
        String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, Week01.wave("two words"));
    }

    @Test
    public void basicTest5() {
        String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, Week01.wave(" gap "));
    }
}
