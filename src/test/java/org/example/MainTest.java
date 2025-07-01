package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isLengthValid_shouldReturnTrue_whenCalledWithLength8(){
        //given
        String pwdStr = "12345678";
        Boolean expected = true;
        //when

        Boolean actual = Main.isLenghtValid(pwdStr);
        //then
       assertEquals(expected, actual);
    }


}