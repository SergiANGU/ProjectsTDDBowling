package dam01.Models;

public class Game {
    private int  pins;
    private int score;
    private boolean isStrike;
    private boolean isSpare;

    public Game() {
        this.pins = 10;
        this.score = 0;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }

    public int getScore() {
        return score;
    }

    public void roll(int pinsDown){

    }
    public int score(){
        int finalScore=0;
        return finalScore;
    }
}
