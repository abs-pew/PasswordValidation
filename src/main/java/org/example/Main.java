package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

// This project is going to validate given password for its length, validity and strength.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);
        System.out.print("Please set up your password: ");
        String userPwd = scanObj.nextLine();

        if (isLengthValid(userPwd) && hasDigits(userPwd) &&
                hasLowerCaseLetter(userPwd) && hasUpperCaseLetter(userPwd) && !isWeak(userPwd)) {
            System.out.println("\"" + userPwd + "\"" + " is a valid password.");
        }  else {
            System.out.println("\"" + userPwd + "\"" + " is NOT a valid password.");
            System.out.println("Password must be 8 characters long. \nMust contain  at least one digit." +
                    "\nMust have at least one lowercase and one uppercase letter.\nMust not be easy to guess.");
        }

    }

    public static boolean isWeak(String pwdStr) {
        String[] weakPasswordsList = {"Password123", "Aa345678", "HelloWorld"};

        boolean result = false;

        for (String weakPass : weakPasswordsList) {
            if (pwdStr.equalsIgnoreCase(weakPass)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean hasUpperCaseLetter(String pwdStr) {
        if (pwdStr.equals(pwdStr.toLowerCase())) {
            return false; // abc = LC(abc) = abc
        } else {
            return true; // Abc != (LC(Abc) = abc)
        }
    }

    public static boolean hasLowerCaseLetter(String pwdStr) {
        if (pwdStr.equals(pwdStr.toUpperCase())) {
            return false; // ABC = UC(ABC)
        } else {
            return true; // Abc != (UC(Abc) = ABC)
        }
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