package com.pluralsight;

import java.util.Scanner;

public class fullNameAlt {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Known Values

        String firstName = promptForString("First name: ");
        String midName = promptForString("Middle name: ");
        String lastName = promptForString("Last name: ");
        String suffix = promptForString("Suffix: ");

        //Calculations

        midName = (midName.isBlank()) ? " " : " " + midName + " ";
        suffix = (suffix.isBlank()) ? " " : ", " + suffix;
        String fullName = firstName + midName + lastName + suffix;
        System.out.println("Full name = " + fullName);

    }

    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
