package com.pluralsight;

import java.util.Scanner;

public class HighscoreWins {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a game score: ");
        String scoreline = input.nextLine();

        String [] parts = scoreline.split("\\|");
        String teamsPart = parts[0];
        String scoresPart = parts[1];


    }
}
