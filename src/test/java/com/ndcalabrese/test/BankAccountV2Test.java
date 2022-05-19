package com.ndcalabrese.test;

import bank_account_v2.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BankAccountV2Test {

    @Test
    @DisplayName("Test isNumeric method in bank_account_v2 package" +
            " Checks to see if argument is a number, and if so, returns true")
    public void isNumericTest() {
        assertTrue(AccountManager.isNumeric("59209"));
        assertFalse(AccountManager.isNumeric("abc"));
    }

}
