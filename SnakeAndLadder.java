package com.codinclub;
public class SnakeAndLadder {
    
    public static final int NoPlay=1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;

    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("position of player is : " + playerPosition);
        int dieNumber = RandomDieValue();
        System.out.println("you got : " + dieNumber);
        int option = RandomOption();
        System.out.println("The option is " + option);

        switch (option) {
            case LADDER:
                playerPosition = playerPosition + dieNumber;
                break;
            case SNAKE:
                playerPosition = playerPosition- dieNumber;
                break;
            default:
                System.out.println("No play");
        }
        System.out.println(playerPosition);
    }

    private static int RandomOption() {
        int RandomOption = (int) Math.floor((Math.random() * 3));
        return RandomOption;
    }

    private static int RandomDieValue() {
        int RandomDieValue = (int) Math.floor((Math.random() * 6) + 1);
        return RandomDieValue;
    }
}








