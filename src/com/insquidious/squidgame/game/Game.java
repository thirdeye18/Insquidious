package com.insquidious.squidgame.game;

public abstract class Game {

    //fields
    private GameType game = null;

    public Game(GameType game) {
        setGame(game);
        oneTime();
    }

    //one-time processing
    private void oneTime() {
        System.out.println("This would be done for every instance of the game class");
    }

    //sub-class methods (different for each subclass)
    protected abstract void postProcessing ();


    //accessors
    public GameType getGame() {
        return game;
    }

    public void setGame(GameType game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Game{" +
                "game=" + game +
                '}';
    }
}