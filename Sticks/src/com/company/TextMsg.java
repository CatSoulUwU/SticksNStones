package com.company;

public class TextMsg {
    public void errorIntake(){
        System.out.println("Please input valid number");
    }
    public void playerTurn(){
        System.out.print("Player takes next amount of sticks = ");
    }
    public void AITurn(int sticks){
        System.out.println("AI takes " + sticks + " sticks");
    }
    public void remains(int remainingSticks){
        System.out.println(remainingSticks + " sticks remaining");
    }
    public void win(boolean playState){
        if (!playState){
            System.out.println("\n!!!Player wins!!!");
        } else {
            System.out.println("\n!!!AI wins!!!");
        }

    }
}
