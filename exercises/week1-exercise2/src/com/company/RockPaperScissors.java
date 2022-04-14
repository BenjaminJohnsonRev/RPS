package com.company;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String yourName = name.next();

        int yourScore = 0;
        int aiScore = 0;

        String s1;
        Scanner again = new Scanner(System.in);
        do {
            ComputerPlayer ai = new ComputerPlayer();

            HumanPlayer you = new HumanPlayer();

            String choice = you.pick();
            String aiChoice = ai.advancedAiSubroutines();

            System.out.println(yourName + " chose: " + choice);

            System.out.println("Ai chooses: " + aiChoice);

            //fun way to evaluate game state
            int why = choice.compareTo(aiChoice);

            //rock paper = 2            Loss
            //rock scissors = -1        Win
            //paper scissors = -3       Loss
            //paper rock = -2           Win
            //scissors paper = 3        Win
            //scissors rock = 1         Loss

            //add 3 to avoid negatives in switch statement
            why = why + 3;

            //System.out.println(why);

            //In ascending order: Loss, Win, Win, Loss, Loss, Win
            switch (why) {
                case 0:
                    System.out.println("You lose!");
                    aiScore++;
                    break;
                case 1:
                    System.out.println("You win!");
                    yourScore++;
                    break;
                case 2:
                    System.out.println("You win!");
                    yourScore++;
                    break;
                case 3:
                    System.out.println("It's a draw!");
                    break;
                case 4:
                    System.out.println("You lose!");
                    aiScore++;
                    break;
                case 5:
                    System.out.println("You lose!");
                    aiScore++;
                    break;
                case 6:
                    System.out.println("You win!");
                    yourScore++;
                    break;
                default:
                    System.out.println("Error: match invalid");
                    break;
            }

            System.out.println("The score is");
            System.out.println(yourName + ": " + yourScore + " to " + "Ai: " + aiScore);
            System.out.println("Play again? (y/n)");
            s1 = again.next();


        }while (s1.equals("y"));
        System.out.println(" ");
    }
}
