package com.jbalceda;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;
    private ArrayList<T> members = new ArrayList<>();
    private int ranking = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println( player.getName()+" is already in the team.");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName()+" picked for team "+this.getName());
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }


    public void match(Team<T>  rivalTeam, int ourScore, int rivalScore){
        /*if (ourScore >= 0 && rivalScore >= 0){
            if (ourScore > rivalScore){
                this.won +=  1;
                rivalTeam.lost += 1;
            }else if (ourScore < rivalScore) {
                this.lost += 1;
                rivalTeam.won += 1;
            }else {
                this.tied += 1;
                rivalTeam.tied += 1;
            }
        }*/
        if (ourScore > rivalScore){
            won++;
            System.out.println("Gana "+this.getName());
        }else if (ourScore == rivalScore){
            tied++;
            System.out.println("Empate para "+this.getName());
        }else {
            lost++;
            System.out.println("Pierde " + this.getName());
        }
        played++;
        if (rivalTeam != null){
            rivalTeam.match(null,rivalScore, ourScore);
        }

    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public int getPlayed() {
        return played;
    }

    public int getRanking() {

        return ranking = (this.getWon()*3)+this.getTied();
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.getRanking() > team.getRanking()){
            return -1;
        }else if (this.getRanking() < team.getRanking()){
            return 1;
        }else {
            return 0;
        }
    }
}

