package com.insquidious.squidgame.player;

public abstract class Player {
    //fields
    protected boolean isAlive;//No need in constructor because every player is alive
    protected String playerName;
    protected int playerSpd = 1;
    protected int playerDist = 0;
    protected int yCoordinate = 0;
    protected int playerID;

    //ctors
    public Player(String playerName)
    {
        setAlive(true);
        setPlayerName(playerName);
    }

    public Player(String playerName, int playerSpd)
    {
        setAlive(true);
        setPlayerName(playerName);
        setPlayerSpd(playerSpd);
    }

    //accessors
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerSpd() {
        return playerSpd;
    }

    public void setPlayerSpd(int playerSpd) {
        this.playerSpd = playerSpd;
    }

    public void setPlayerID(int playerID){
       this.playerID = playerID;
    }

    public int getPlayerID(){
        return playerID;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}