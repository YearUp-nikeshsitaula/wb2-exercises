package com.pluralsight;
import java.util.*;
import java.util.regex.Pattern;

public class FullNameParser {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //KNOWN VALUES
        String fullName = promptForString("Enter your name: ");
        String firstName = "";
        String midName = "";
        String lastName = "";
        // namePart splits fullName by spaces
        String[] namePart = fullName.split(Pattern.quote(" "));

        //CALCULATIONS
        if (namePart.length == 1){
            firstName = namePart[0];
        }
        else if (namePart.length == 2){
            firstName = namePart[0];
            lastName = namePart[1];
        } else if (namePart.length == 3){
            firstName = namePart[0];
            midName = namePart [1];
            lastName = namePart [2];
        }

        // Output print
        System.out.println("First Name: " + firstName);

        // For middle name if it is blank
        if (midName.isBlank()) {
            System.out.println("Middle Name: (none)");
        }
        else {
            System.out.println("Middle Name: " + midName);
        }

        System.out.println("Last Name: " + lastName);

    }

    // Methods
    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
