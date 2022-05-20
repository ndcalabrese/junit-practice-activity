package com.ndcalabrese.test;
import bank_account_v2.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class BankAccountV2Test {

    @Test
    @DisplayName("Test isNumeric method in bank_account_v2 package" +
            " Checks to see if argument is a number, and if so, returns true")
    public void isNumericTest() {
        assertTrue(AccountManager.isNumeric("59209"));
        assertFalse(AccountManager.isNumeric("abc"));
    }

    BankAccount account1 = new BankAccount(1, "Nick", 500);
    BankAccount setterTester = new BankAccount(0, "null", 0);
    @Test
    public void getAccNumberTest() {
        assertEquals("1", account1.getAccNumber());
    }

    @Test
    public void getAccHolderNameTest() {
        assertEquals("Nick", account1.getAccHolderName());
    }

    @Test
    public void getAccBalanceTest() {
        assertEquals(500, account1.getAccBalance());
    }

    @Test
    public void hasInsufficientFundsTest() {
        assertTrue(account1.hasInsufficientFunds(5000));
    }

    @Test
    public void setAccNumberTest() {
        setterTester.setAccNumber(100);
        assertEquals("100", setterTester.getAccNumber());
    }

    @Test
    public void setAccHolderNameTest() {
        setterTester.setAccHolderName("This test worked");
        assertEquals("This test worked", setterTester.getAccHolderName());
    }

    @Test
    public void setAccBalanceTest() {
        setterTester.setAccBalance(1000);
        assertEquals(1000, setterTester.getAccBalance());
    }

    @Test
    public void toStringTest() {
        assertEquals("The account balance of account for Nick is $500.00", account1.toString());
    }

}
