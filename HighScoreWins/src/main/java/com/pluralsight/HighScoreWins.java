package com.pluralsight;
import java.util.*;
import java.util.regex.Pattern;

public class HighScoreWins {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        //Declaring Variables
        String userInput =  promptForString("Please enter a game score: ");
        String homeTeam = "";
        String visitorTeam = "";
        String homeScore = "";
        String visitorScore = "";

        //Declaring a regex split so : and | would split the string
        String[] stringSpace = userInput.split("[:|]");

        if (stringSpace.length == 4){
            homeTeam = stringSpace[0];
            visitorTeam = stringSpace[1];
            homeScore = stringSpace[2];
            visitorScore = stringSpace[3];
        }

        // Turning String index 2 and 3 to an Integer
        int home = Integer.parseInt(homeScore);
        int visitor = Integer.parseInt(visitorScore);

        //If statements to pick a Winner or draw
        if(home > visitor){
            System.out.print("Winner: " + homeTeam);
        } else if (home < visitor) {
            System.out.print("Winner: " + visitorTeam);
        } else {
            System.out.println("Draw");
        }

    }

    // Methods
    public static String promptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
