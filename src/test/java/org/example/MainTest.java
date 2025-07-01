package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Tests for isLengthValid
    //====================================

    @Test
    void hasDigits_shouldReturnFalse_whenCalledWithPwdWithoutDigits() {
        //given
        String pwdStr = "PassCodeIsThis";
        Boolean expected = false;
        //when
        Boolean actual = Main.hasDigits(pwdStr);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void hasDigits_shouldReturnTrue_whenCalledWithPwdWithDigits() {
        //given
        String pwdStr = "PassCodeIsThis23";
        Boolean expected = true;
        //when
        Boolean actual = Main.hasDigits(pwdStr);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void hasDigits_shouldReturnTrue_whenCalledWithPwd_Pass2950Code() {
        //given
        String pwdStr = "Pass2950Code";
        Boolean expected = true;
        //when
        Boolean actual = Main.hasDigits(pwdStr);
        //then
        assertEquals(expected, actual);
    }


    // Tests for isLengthValid
    //====================================
    @Test
    void isLengthValid_shouldReturnFalse_whenCalledWithNullOrEmpty(){
        //given
        String pwdStr = "";
        Boolean expected = false;
        //when

        Boolean actual = Main.isLengthValid(pwdStr);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void isLengthValid_shouldReturnFalse_whenCalledWithLengthLessThan8(){
        //given
        String pwdStr = "01234";
        Boolean expected = false;
        //when

        Boolean actual = Main.isLengthValid(pwdStr);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void isLengthValid_shouldReturnTrue_whenCalledWithLength12(){
        //given
        String pwdStr = "123456789123This is insane but this is fine";
        Boolean expected = true;
        //when

        Boolean actual = Main.isLengthValid(pwdStr);
        //then
        assertEquals(expected, actual);
    }

@Test
    void isLengthValid_shouldReturnTrue_whenCalledWithLength8(){
        //given
        String pwdStr = "12345678";
        Boolean expected = true;
        //when

        Boolean actual = Main.isLengthValid(pwdStr);
        //then
       assertEquals(expected, actual);
    }


}