package dam01;

import dam01.Models.Game;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.inici();
    }

    public void inici(){
        Game actualGame = newGame();
        actualGame.roll(rollPins(actualGame));
    }


    public Game newGame(){
        return new Game();
    }
    public int rollPins(Game actualGame){
        int pinsDown = 0;
        for(int i = 0; i < 2; i++){
            pinsDown = randomNumberGenerator(1, actualGame.getPins());
            comprovatePins(pinsDown, actualGame);
            actualGame.setPins(10 - pinsDown);
            System.out.println(pinsDown);
        }

        return pinsDown;
    }
    public void comprovatePins(int pinsDown, Game actualGame){
        if (pinsDown == 10){
            actualGame.setPins(10);
            rollPins(actualGame);
        }

    }

    public int randomNumberGenerator(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
