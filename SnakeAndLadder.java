package com.codinclub;

import java.util.Random;

public class SnakeAndLadder
{
    public static void main(String[] args)
    {
        int playerPosition = 0;
        int diceNumber;
        System.out.println("position of player is : " + playerPosition);
        diceNumber = RandomDieNUmber();
        System.out.println("you got : " + diceNumber);
    }
    private static int RandomDieNUmber() {
        int RandomValue = (int) Math.floor((Math.random() * 6) + 1);
        return RandomValue;
    }
}







