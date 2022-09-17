package com.codinclub;

import java.util.Random;

public class SnakeAndLadder {

    public static final int NoPlay = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;

    public static final int WinningPosition = 100;

    public static void main(String[] args) {
        int playerPosition = 0;
        int count=0;
        System.out.println("position of player is : " + playerPosition);

        while (playerPosition < 100 ){
            int dieNumber = RandomDieValue();
            System.out.println("you got : " + dieNumber);

            int option = RandomOption();

            switch (option) {
                case LADDER:
                    if(playerPosition>100) {
                        playerPosition = 100;
                        playerPosition = playerPosition + dieNumber;
                        playerPosition = playerPosition - dieNumber;
                        System.out.println("Ladder :" + LADDER);
                        System.out.println("hurry ! you won the game");
                    }
                    count++;
                         break;

                case SNAKE:
                    if(playerPosition<0) {
                        playerPosition = playerPosition - dieNumber;
                        System.out.println("Snake :" + SNAKE);
                    }
                    break;
                default:
                    System.out.println("No play");
            }
            System.out.println( " current position of player :" +playerPosition );
        }
        System.out.println("congrats you win");
        System.out.println("roll the dice " +count);
    }
    public static int RandomOption() {
        int RandomOption = (int) Math.floor((Math.random() * 3));
        return RandomOption;
    }
    private static int RandomDieValue() {
        int RandomDieValue = (int) Math.floor((Math.random() * 6) + 1);
        return RandomDieValue;
    }
}






