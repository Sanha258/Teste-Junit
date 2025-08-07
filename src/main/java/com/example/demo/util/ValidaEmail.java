package com.example.demo.util;

public class ValidaEmail {

    public static boolean validaCaracterArroba(String input) {

        return input != null && input.contains("@");

    }

}
