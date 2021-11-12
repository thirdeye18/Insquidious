package com.insquidious.squidgame.game;

public class RedLightGreenLightGame extends Game {

    public RedLightGreenLightGame() {
        super(GameType.REDLIGHTGREENLIGHT);
        postProcessing();
    }

    @Override
    protected void postProcessing() {
        System.out.println("This happens after the Game object is made");
    }

    @Override
    public String toString() {
        return "RedLightGreenLightGame{}";
    }
}