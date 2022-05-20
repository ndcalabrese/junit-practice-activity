package com.ndcalabrese.test;

import divide_method.DivideMethod;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTest {

    @Test
    @DisplayName("Test formatNumbers method in divide_method.DivideMethod")
    public void formatNumbersTest() {
        double[] testNumbers = { -50, 10.0 };
        assertEquals("[-50, 10]", Arrays.toString(DivideMethod.formatNumbers(testNumbers)));
    }

}