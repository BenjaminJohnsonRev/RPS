package com.company;

import java.util.Scanner;


public class HumanPlayer {

    String name;

    public HumanPlayer(){
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        this.name = name.next();
    }
    //This method gives human players input for their choice.
    String pick() {
        Scanner rps = new Scanner(System.in);

        System.out.println("Choose rock, paper, or scissors: ");
        String choice = rps.next();
        return choice;
    }

    int pickTTT() {
        Scanner ttt = new Scanner(System.in);

        System.out.println("Choose an available location 1 - 9: ");
        int choice = ttt.nextInt();
        return choice;
    }
}
