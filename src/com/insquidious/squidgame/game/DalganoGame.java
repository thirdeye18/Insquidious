package com.insquidious.squidgame.game;

public class DalganoGame extends Game {

    public DalganoGame() {
        super(GameType.DALGANO);
        postProcessing();
    }

    @Override
    protected void postProcessing() {
        System.out.println("Dalgano post processing");
    }
}