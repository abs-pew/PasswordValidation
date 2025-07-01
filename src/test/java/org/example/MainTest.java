package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    // Tests for isLengthValid
    //====================================
    @Test
    void isLengthValid_shouldReturnFalse_whenCalledWithNullOrEmpty(){
        //given
        String pwdStr = "";
        Boolean expected = false;
        //when

        Boolean actual = Main.isLenghtValid(pwdStr);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void isLengthValid_shouldReturnFalse_whenCalledWithLengthLessThan8(){
        //given
        String pwdStr = "01234";
        Boolean expected = false;
        //when

        Boolean actual = Main.isLenghtValid(pwdStr);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void isLengthValid_shouldReturnTrue_whenCalledWithLength12(){
        //given
        String pwdStr = "123456789123";
        Boolean expected = true;
        //when

        Boolean actual = Main.isLenghtValid(pwdStr);
        //then
        assertEquals(expected, actual);
    }

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