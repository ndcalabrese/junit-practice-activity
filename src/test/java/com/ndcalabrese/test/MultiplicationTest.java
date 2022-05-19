package com.ndcalabrese.test;

import multiplication.Multiplication;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    @DisplayName("Test formatNumber method in Multiplication package." +
            " If argument double is also greater than 999, include commas," +
            " and return value as a String with commas")
    public void testFormatNumber() {
        assertEquals("929,490,924", Multiplication.formatNumber(929_490_924));
    }

}
