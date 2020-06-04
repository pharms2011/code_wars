package com.inertia.integers;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TrainingZerosTests {
    @Test
    public void testZeros() throws Exception {
        assertThat(TrailingZeros.zeros(0), is(0));
        assertThat(TrailingZeros.zeros(6), is(1));
        assertThat(TrailingZeros.zeros(14), is(2));
    }
}
