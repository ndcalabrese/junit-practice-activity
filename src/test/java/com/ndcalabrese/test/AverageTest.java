package com.ndcalabrese.test;

import average_method.AverageMethod;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {

    @Test
    @DisplayName("Test sum method in average_method.AverageMethod")
    public void sumTest() {
        double[] testNumbers = { -50, 2.928, 100.59 };
        assertEquals(53.518, AverageMethod.sum(testNumbers));
    }

}
