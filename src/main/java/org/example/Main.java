package org.example;

import java.util.Arrays;

// This project is going to validate given password for its length, validity and strength.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static boolean hasDigits(String pwdStr) {
        String[] digitsArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        boolean result = false;

        for (int i = 0; i < 10; i++) {
            if (pwdStr.contains(digitsArray[i])) {
                result = true;
                break;
            }
        }
        return result;

    }
    public static boolean isLengthValid(String pwdStr) {
        if (pwdStr == null || pwdStr.trim().isEmpty() || pwdStr.length() < 8) {
            return false;
        } else {
        return true;}
    }
}