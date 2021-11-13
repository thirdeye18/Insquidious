package com.insquidious.squidgame.game;

public class GameFactory {
    public static Game buildGame(GameType gameType) {
        Game game = null;

        //Switch controls which type of game is instantiated based on Enum passed
        switch (gameType) {
            case REDLIGHTGREENLIGHT:
                game = new RedLightGreenLightGame();
                break;
            case DALGANO:
                game = new DalganoGame();
                break;
            case TUGOFWAR:
                break;
            case GLASSBRIDGE:
                break;
            case MARBLES:
                break;
            default:
                //possibly throw exception at some time
                //TODO: add in throwing exception
                System.out.println("Invalid game type passed");
        }
        return game;
    }
}