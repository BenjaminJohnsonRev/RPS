package com.company;

public class TicTacToeBoard {
    String one = "1";
    String two = "2";
    String three = "3";
    String four = "4";
    String five = "5";
    String six = "6";
    String seven = "7";
    String eight = "8";
    String nine = "9";
    Boolean playerVictory = false;
    Boolean aiVictory = false;

    //displays board in console
    public void boardState(){
        System.out.println(this.one + " | " + this.two + " | " + this.three);
        System.out.println(this.four + " | " + this.five + " | " + this.six);
        System.out.println(this.seven + " | " + this.eight + " | " + this.nine);
    }

    //checks if someone has won
    public void checkBoardState(){
        //horizontals
        if (one == two){
            if(two == three){
                if(three == "X") {
                    playerVictory = true;
                }
            }
        }
        if (four == five){
            if(five == six){
                if(six == "X") {
                    playerVictory = true;
                }
            }
        }
        if (seven == eight){
            if(eight == nine){
                if(nine == "X") {
                    playerVictory = true;
                }
            }
        }
        //verticals
        if (one == four){
            if(four == seven){
                if(seven == "X") {
                    playerVictory = true;
                }
            }
        }
        if (two == five){
            if(five == eight){
                if(eight == "X") {
                    playerVictory = true;
                }
            }
        }
        if (three == six){
            if(six == nine){
                if(nine == "X") {
                    playerVictory = true;
                }
            }
        }
        //diagonals
        if (one == five){
            if(five == nine){
                if(nine == "X") {
                    playerVictory = true;
                }
            }
        }
        if (seven == five){
            if(five == three){
                if(three == "X") {
                    playerVictory = true;
                }
            }
        }

        //horizontals
        if (one == two){
            if(two == three){
                if(three == "O") {
                    aiVictory = true;
                }
            }
        }
        if (four == five){
            if(five == six){
                if(six == "O") {
                    aiVictory = true;
                }
            }
        }
        if (seven == eight){
            if(eight == nine){
                if(nine == "O") {
                    aiVictory = true;
                }
            }
        }
        //verticals
        if (one == four){
            if(four == seven){
                if(seven == "O") {
                    aiVictory = true;
                }
            }
        }
        if (two == five){
            if(five == eight){
                if(eight == "O") {
                    aiVictory = true;
                }
            }
        }
        if (three == six){
            if(six == nine){
                if(nine == "O") {
                    aiVictory = true;
                }
            }
        }
        //diagonals
        if (one == five){
            if(five == nine){
                if(nine == "O") {
                    aiVictory = true;
                }
            }
        }
        if (seven == five){
            if(five == three){
                if(three == "O") {
                    aiVictory = true;
                }
            }
        }
    }
}
