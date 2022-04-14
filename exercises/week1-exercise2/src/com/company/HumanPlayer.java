package com.company;

import java.util.Scanner;


public class HumanPlayer {


    //This method gives human players input for their choice.
    String pick() {
        Scanner rps = new Scanner(System.in);

        System.out.println("Choose rock, paper, or scissors: ");
        String choice = rps.next();
        return choice;
    }
}
