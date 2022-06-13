package com.codedifferently.atm.accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckingAccountTest {

    @Test
    @DisplayName("Constructor test")
    public void constructorTest01(){
        // Given
        CheckingAccount checkingAccount = new CheckingAccount(20.00);
        String expected  = "1 20.00";
        String actual = checkingAccount.toString();
        Assertions.assertEquals(expected, actual);
    }
}
