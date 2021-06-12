package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playState = false;
        //false = AI's turn
        //true = Player's turn
        int remainingSticks = 20;
        int lastTurn = 1;
        AILogic ai = new AILogic();
        Scanner sc = new Scanner(System.in);
        TextMsg txt = new TextMsg();

        System.out.println("\nGAME STARTS!\n");
        while (remainingSticks > 1) {
            txt.remains(remainingSticks);
            if (playState) {
                txt.playerTurn();
                lastTurn = sc.nextInt();
                if ((lastTurn <= 3)&&(lastTurn >= 1)) {
                    ai.setLastTurn(lastTurn);
                    remainingSticks -= lastTurn;
                } else {
                    txt.errorIntake();
                    continue;
                }
            } else {
                remainingSticks -= (4 - lastTurn);
                txt.AITurn(4 - lastTurn);
            }
            playState = !playState;
        }
        if (remainingSticks == 1){
            txt.remains(remainingSticks);
            txt.win(playState);
        }
    }
}
