package com.ndcalabrese.test;

import count_to_eleven.CountToEleven;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountToElevenTest {

    @Test
    @DisplayName("Test formatNumber method in CountToEleven package." +
            " If argument double is also an integer," +
            " cast the argument double to an integer and" +
            " return it as a String")
    public void testFormatNumber() {
        assertEquals("4", CountToEleven.formatNumber(4.0000));
    }

}
