package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    // Tests for BONUS - hasSpecialCharacter
    //====================================

    @Test
    void hasSpecialCharacter_shouldReturnTrue_whenCalledWithPwdWithSpecialCharacter() {
        //given
        //    String pwdStr = "PassCodeIsThis!";
           String pwdStr = "AREST2025e%";
        // String pwdStr = "alllowercase2024?";
        Boolean expected = true;
        //when
        Boolean actual = Main.hasSpecialCharacter(pwdStr);
        //then
        assertEquals(expected, actual);
    }

    // Tests for isWeak
    //====================================

    @Test
    void isWeak_shouldReturnTrue_whenCalledWithPwd_Password123() {
        //given
        String pwdStr = "password123";
       // String pwdStr = "helloworld";
        Boolean expected = true;
        //when
        Boolean actual = Main.isWeak(pwdStr);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void isWeak_shouldReturnTrue_whenCalledWithPwd_Aa345678() {
        //given
        String pwdStr = "Aa345678";
        Boolean expected = true;
        //when
        Boolean actual = Main.isWeak(pwdStr);
        //then
        assertEquals(expected, actual);
    }



    // Tests for hasUpperCaseLetter
    //====================================

    @Test
    void hasUpperCaseLetter_shouldReturnFalse_whenCalledWithPwdWithNoUpperCaseLetter() {
        //given
        String pwdStr = "all letters are in lower case";
        Boolean expected = false;
        //when
        Boolean actual = Main.hasUpperCaseLetter(pwdStr);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void hasUpperCaseLetter_shouldReturnTrue_whenCalledWithPwdWithUpperCaseLetter() {
        //given
        //   String pwdStr = "PassCodeIsThis";
            String pwdStr = "allsmallbutone2025_T";
        // String pwdStr = "Allowercase2024";
        Boolean expected = true;
        //when
        Boolean actual = Main.hasUpperCaseLetter(pwdStr);
        //then
        assertEquals(expected, actual);
    }


    // Tests for hasLowerCaseLetter
    //====================================

    @Test
    void hasLowerCaseLetter_shouldReturnFalse_whenCalledWithPwdWithNoLowerCaseLetter() {
        //given
        String pwdStr = "THISISMYPASSWORD";
        Boolean expected = false;
        //when
        Boolean actual = Main.hasLowerCaseLetter(pwdStr);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void hasLowerCaseLetter_shouldReturnTrue_whenCalledWithPwdWithLowerCaseLetter() {
        //given
    //    String pwdStr = "PassCodeIsThis";
    //    String pwdStr = "AREST2025e";
        String pwdStr = "alllowercase2024";
        Boolean expected = true;
        //when
        Boolean actual = Main.hasLowerCaseLetter(pwdStr);
        //then
        assertEquals(expected, actual);
    }


    // Tests for hasDigits
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