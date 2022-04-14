package com.company;


import java.util.Random;

public class ComputerPlayer {
    String advancedAiSubroutines() {

        Random rps = new Random();

        //picks a random number 0, 1 or 2
        int randomPick = rps.nextInt(3);

        //picks a random move
        String[] arr={"rock", "paper", "scissors"};
        String aiChoice = arr[randomPick];

        return aiChoice;
    }
}
