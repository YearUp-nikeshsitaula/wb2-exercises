package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Known Values

        String firstName = promptForString("First name: ");
        String midName = promptForString("Middle name: ");
        String lastName = promptForString("Last name: ");
        String suffix = promptForString("Suffix: ");
        String fullName;

        //Calculations

        if (firstName.isBlank()) {
            System.out.println("Please give your first name!");
        }

        if (midName.isBlank()){
            midName = " ";
        } else {
            midName = " " + midName + " ";
        }

        // If suffix is NOT blank = !suffix
        if(!suffix.isBlank()){
            suffix = ", " + suffix;
        }

        fullName = firstName + midName + lastName + suffix;
        System.out.println("Full name = " + fullName);

    }


    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
