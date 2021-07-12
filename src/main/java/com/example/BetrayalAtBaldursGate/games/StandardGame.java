package com.example.BetrayalAtBaldursGate.games;

public class StandardGame extends GameState{

    private int omenCounter;

    public StandardGame() {
        super();
        this.omenCounter = 0;
//        this.populateGame();
    }

    public int getOmenCounter() {
        return omenCounter;
    }

    public void setOmenCounter(int omenCounter) {
        this.omenCounter = omenCounter;
    }
}
