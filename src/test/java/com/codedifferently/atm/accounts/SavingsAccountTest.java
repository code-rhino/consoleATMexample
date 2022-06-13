package com.codedifferently.atm.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {
    @Test
    @DisplayName("Constructor test")
    public void constructorTest01(){
        // Given
        SavingsAccount savingsAccount = new SavingsAccount(20.50);
        String expected  = "1 20.50";
        String actual = savingsAccount.toString();
        Assertions.assertEquals(expected, actual);
    }
}
