package com.insquidious.squidgame.player;

import java.util.Random;

public class ComputerPlayer extends Player{
    //static final fields
    private static final int MAX_SPEED = 5;
    private static final int MIN_SPEED = 2;

    public ComputerPlayer(String playerName){
        super(playerName);
        setPlayerSpd(generateRandomSpeed());
    }

    private int generateRandomSpeed(){
        Random randomSpeed = new Random();
        //return random int b/t min and max(inclusive)
        return randomSpeed.nextInt(((MAX_SPEED - MIN_SPEED) + 1) + MIN_SPEED);
    }

    //pretty sure not needed because they would get inherited
/*    @Override
    public int getPlayerSpd() {
        return playerSpd;
    }

    @Override
    public void setPlayerSpd(int playerSpd) {
        this.playerSpd = playerSpd;
    }*/

    @Override
    public String toString() {
        return "ComputerPlayer{" +
                "maxSpeed=" + MAX_SPEED +
                ", isAlive=" + isAlive +
                ", playerName='" + playerName +
                ", playerSpd=" + playerSpd +
                ", playerDist=" + playerDist +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}