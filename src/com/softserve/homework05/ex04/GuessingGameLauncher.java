package com.softserve.homework05.ex04;

public class GuessingGameLauncher {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
//        System.out.println(game.getNumberToGuess()); //unhide if needed to quick-check functionality
        while (game.isGameContinues()) {
            game.checkIfWin(game.guessNumber());
        }
    }
}
