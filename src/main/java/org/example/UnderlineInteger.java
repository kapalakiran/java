package org.example;

public class UnderlineInteger {
    public static void main(String[] args) {
        int number = 123;

        // ANSI escape code for underlining
        String underline = "\u001B[4m";
        String reset = "\u001B[0m";

        // Printing the underlined number
        System.out.println(underline + number + reset);
    }
}