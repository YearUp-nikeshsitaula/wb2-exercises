package com.pluralsight;
import java.util.*;

public class ParserAlt {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        String fullName = promptForString("Enter Full name: ");


        int indexOfFirstSpace = fullName.indexOf(' ');

        String firstName = fullName.substring(0, indexOfFirstSpace);
        String endaPart = fullName.substring(indexOfFirstSpace + 1);
        String midName = "";
        String lastName = "";

        System.out.println("First name "+ firstName);
        System.out.println("Middle name "+ midName);
        System.out.println("Last name "+ lastName);
        System.out.println("Ending part "+ endaPart);



    }
    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
