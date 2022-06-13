package com.codedifferently.atm.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    @DisplayName("Constructor test Success")
    public void constructorTest01(){
        User user = new User("Tariq", "Hook", "1234");
        String expected = "1 Tariq Hook 1234";

        String actual = user.toString();
        Assertions.assertEquals(expected, actual);
    }
}
