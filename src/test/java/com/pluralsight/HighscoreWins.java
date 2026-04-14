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

        String[] teams = teamsPart.split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];





    }
}
