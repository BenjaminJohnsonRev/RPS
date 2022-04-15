package com.company;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println(" ");

        ComputerPlayer ai = new ComputerPlayer();

        HumanPlayer you = new HumanPlayer();

        String yourName = you.name;

        int yourScore = 0;
        int aiScore = 0;

        String s1;
        Scanner again = new Scanner(System.in);

        System.out.println(yourName + " will have their choices marked with X.");
        System.out.println("The Ai will mark its choices with O.");

        // new game starts here
        do {

            TicTacToeBoard board = new TicTacToeBoard();

            Random coin = new Random();

            //flips coin for who goes first
            int turn = coin.nextInt(2);

            //for loop limited to 9 turns because there are nine spaces
            for(int i = 0; i < 9; i++){
                //player acts when turn value is 0
                if(turn == 0){
                    //switches turn value to allow other player to act next
                    turn = 1;

                    //error lets do-while loop if an invalid choice is made (ex: choosing a spot that has already been taken)
                    int error = 0;
                    do{
                        board.boardState();
                        int pick = you.pickTTT();
                        error = 0;
                        switch (pick){
                            case 1:
                                //checks to see if location one is available to pick
                                if(board.one != "1"){
                                    error = 1;
                                    break;
                                }
                                board.one = "X";
                                break;
                            case 2:
                                if(board.two != "2"){
                                    error = 1;
                                    break;
                                }
                                board.two = "X";
                                break;
                            case 3:
                                if(board.three != "3"){
                                    error = 1;
                                    break;
                                }
                                board.three = "X";
                                break;
                            case 4:
                                if(board.four != "4"){
                                    error = 1;
                                    break;
                                }
                                board.four = "X";
                                break;
                            case 5:
                                if(board.five != "5"){
                                    error = 1;
                                    break;
                                }
                                board.five = "X";
                                break;
                            case 6:
                                if(board.six != "6"){
                                    error = 1;
                                    break;
                                }
                                board.six = "X";
                                break;
                            case 7:
                                if(board.seven != "7"){
                                    error = 1;
                                    break;
                                }
                                board.seven = "X";
                                break;
                            case 8:
                                if(board.eight != "8"){
                                    error = 1;
                                    break;
                                }
                                board.eight = "X";
                                break;
                            case 9:
                                if(board.nine != "9"){
                                    error = 1;
                                    break;
                                }
                                board.nine = "X";
                                break;
                            default:
                                System.out.println("You picked an invalid number, try again.");
                                error = 1;
                                break;
                        }
                    } while (error == 1);
                } else if (turn == 1){
                    turn = 0;
                    int error = 0;
                    do{
                        int pick = ai.advancedAiSubroutinesTTT();
                        error = 0;
                        switch (pick){
                            case 1:
                                if(board.one != "1"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.one = "O";
                                break;
                            case 2:
                                if(board.two != "2"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.two = "O";
                                break;
                            case 3:
                                if(board.three != "3"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.three = "O";
                                break;
                            case 4:
                                if(board.four != "4"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.four = "O";
                                break;
                            case 5:
                                if(board.five != "5"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.five = "O";
                                break;
                            case 6:
                                if(board.six != "6"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.six = "O";
                                break;
                            case 7:
                                if(board.seven != "7"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.seven = "O";
                                break;
                            case 8:
                                if(board.eight != "8"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.eight = "O";
                                break;
                            case 9:
                                if(board.nine != "9"){
                                    error = 1;
                                    break;
                                }
                                board.boardState();
                                System.out.println("Ai picks!");

                                board.nine = "O";
                                break;
                            default:
                                System.out.println("You picked an invalid number, try again.");
                                error = 1;
                                break;
                        }
                    } while (error == 1);
                }

                board.checkBoardState();
                if(board.playerVictory){
                    i = 9;
                    System.out.println("Victory goes to " + yourName + "!");
                    board.boardState();
                    yourScore++;
                }
                if(board.aiVictory){
                    i = 9;
                    System.out.println("The AI won this time.");
                    board.boardState();
                    aiScore++;
                }
            }


            System.out.println("The score is");
            System.out.println(yourName + ": " + yourScore + " to " + "Ai: " + aiScore);
            System.out.println("Play again? (y/n)");
            s1 = again.next();


        } while (s1.equals("y"));
    }
}
