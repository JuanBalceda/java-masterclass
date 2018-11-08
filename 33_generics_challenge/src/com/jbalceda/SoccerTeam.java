package com.jbalceda;

public class SoccerTeam extends Team {

    private int ranking;

    public SoccerTeam(String name) {
        super(name);
    }

    public int getRanking() {
        this.ranking = (this.getWon() * 3) + this.getTied();
        return this.ranking;
    }

}
