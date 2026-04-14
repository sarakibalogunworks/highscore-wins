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
        String visitorsTeam = teams[1];


        String[] scores = scoresPart.split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorsScore = Integer.parseInt(scores[1]);


        String winner;
        if (homeScore > visitorsScore){
            winner =homeTeam;
        } else {
            winner = visitorsTeam;
        }

        System.out.println("Winner: " + winner);





    }
}
