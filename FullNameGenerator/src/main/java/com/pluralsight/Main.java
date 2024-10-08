package com.pluralsight;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Known Values

        String firstName = promptForString("First name: ");
        String midName = promptForString("Middle name: ");
        String lastName = promptForString("Last name: ");
        String suffix = promptForString("Suffix: ");
        String fullName;

        //Calculations

        if(midName.isBlank()) {
            if (suffix.isBlank()) {
                fullName = (firstName + " " + lastName);
            }
            else{
                fullName = (firstName + " " + lastName + " " + suffix);
            }
        }
        else{
            if (suffix.isBlank()) {
                fullName = firstName + " " + midName + " " + lastName;
            }
            else {
                fullName = firstName + " " + midName + " " + lastName + " " + suffix;
            }
        }
    }


    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}