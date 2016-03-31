/*
 * Play against a computer in classic Roshambo. The rules are simple: rock beats
 * scissors, scissors beats paper, and paper beats rock. If the two moves are 
 * equal, then it is a tie which results in starting the round over.
 * Time estimate: 45 minutes
 * Actual time: 66 minutes
 * @author Ashley Holcomb
 */
package edu.blackburn.cs.cs212sp16.roshambo.priceholcomb;

import java.util.Scanner;

/**
 * All necessary methods are in this class.
 */
public class OldRoshambo {

    private static int rounds;              //number of matches
    private static int playerScore = 0;     //tally of player's wins
    private static int compScore = 0;       //tally of computer's wins

    /*
     * Generates a random integer between any two given numbers
     * @param min - lowest possible value
     * @param max - highest possible value
     */
    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /*
     * Determines the computer's move randomly using the getRandomInt method
     */
    public static String compTurn() {
        int move = getRandomInt(1, 3);
        if (move == 1) {
            return "ROCK";
        } else if (move == 2) {
            return "PAPER";
        } else {
            return "SCISSORS";
        }
    }

    /*
     * Compares the two moves and gives a point to the winner based on the 
     * classic Roshambo rules. 
     * @param comp - the computer's move
     * @param player - the player's move
     */
    public static void determineWinner(String comp, String player) {
        //This if/else-if assesses every possible combination of moves.
        if (comp.equals(player)) {
            System.out.println(player + " ties " + comp);
        } else if (player.equals("ROCK")) {
            if (comp.equals("SCISSORS")) {
                System.out.println(player + " beats " + comp + ". You win this "
                        + "round.");
                playerScore++;
            } else {
                System.out.println(comp + " beats " + player + ". I win this "
                        + "round.");
                compScore++;
            }
        } else if (player.equals("PAPER")) {
            if (comp.equals("ROCK")) {
                System.out.println(player + " beats " + comp + ". You win this "
                        + "round.");
                playerScore++;
            } else {
                System.out.println(comp + " beats " + player + ". I win this "
                        + "round.");
                compScore++;
            }
        } else if (player.equals("SCISSORS")) {
            System.out.println(player + " beats " + comp + ". You win this "
                    + "round.");
            playerScore++;
        } else {
            System.out.println(comp + " beats " + player + ". I win this "
                    + "round.");
            compScore++;
        }
    }

    /*
     * Calculates the win percentage for the player and displays it.
     */
    public static void crunchNumbers() {
        double stats = (playerScore / rounds) * 100;
        System.out.println("Rounds: " + rounds + "\nPlayer: " + playerScore
                + "\nComputer: " + compScore);
        //Determines who won the majority of the rounds
        if (stats > 50) {
            System.out.println("You won " + stats + "% of the games so you "
                    + "won!");
        } else if (stats < 50) {
            System.out.println("You only won " + stats + "% of the games so you"
                    + " lost.");
        } else {
            System.out.println("After all of those rounds, you tied with the "
                    + "computer.");
        }
    }

    /**
     * The player only interacts with the game through this method.
     */
    public static void main(String[] args) {
        String compMove;                    //the computer's move
        String playerMove;                  //the player's move

        Scanner input = new Scanner(System.in);

        System.out.print("How many rounds would you like to play? (1-100): ");
        rounds = input.nextInt();

        //Loop allows game to last as many rounds as the player specified
        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round " + i);
            System.out.print("Your move [rock, paper, scissors]: ");
            playerMove = input.next().toUpperCase();
            compMove = compTurn();
            System.out.println("Computer's move: " + compMove);
            determineWinner(compMove, playerMove);

            //Starts the round over in the event of a tie
            if (playerMove.equals(compMove)) {
                i--;
            }

            System.out.println("Player: " + playerScore);
            System.out.println("Computer: " + compScore);
        }
        crunchNumbers();
    }
}
