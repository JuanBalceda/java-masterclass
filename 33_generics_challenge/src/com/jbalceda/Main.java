package com.jbalceda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*

        FootballPlayer joe = new FootballPlayer("Joe D");
        SoccerPlayer juan = new SoccerPlayer("Juan B");
        BaseballPlayer gary = new BaseballPlayer("Gary V");

        Team<FootballPlayer> crows = new Team<>("Crows");
        crows.addPlayer(joe);
        crows.addPlayer(juan);

        System.out.println(crows.numPlayers());

        Team<BaseballPlayer> chicago = new Team<>("Chicago");
        chicago.addPlayer(gary);

        System.out.println(chicago.numPlayers());
*/
        Team<SoccerPlayer> manU = new Team<>("Manchester United");
        Team<FootballPlayer> aust = new Team<>("Australia");
        Team<SoccerPlayer> barca = new Team<>("FC Barcelona");
        Team<SoccerPlayer> rMad = new Team<>("Real Madrid");

        System.out.println("Soccer Teams:");
        System.out.println(manU.getName());
        System.out.println(barca.getName());
        System.out.println(rMad.getName());
        System.out.println("-------------");
        barca.match(manU,2,1);
        barca.match(rMad,6,1);
        manU.match(barca,1,1);
        manU.match(rMad,2,0);
        rMad.match(manU,0,0);
        rMad.match(barca,0,3);

        League<Team<SoccerPlayer>> liga = new League<>("La Liga");
        liga.add(barca);
        liga.add(rMad);

        liga.showLeagueTable();
//        barca.match(aust,5,0);
/*
        System.out.println("-------------");
        System.out.println("Results");

        System.out.println(barca.getName() +": "+barca.getRanking());
        System.out.println(manU.getName() +": "+manU.getRanking());
        System.out.println(rMad.getName() +": "+rMad.getRanking());

        System.out.println(barca.compareTo(manU));
        ArrayList<Team<SoccerPlayer>> teams = new ArrayList<>();
        teams.add(manU);
        teams.add(rMad);
        teams.add(barca);
        System.out.println("-------------");
        System.out.println("Table");
        Collections.sort(teams);
        System.out.println("*");
        for (Team t : teams){
            System.out.println(t.getName()+": "+t.getRanking());
        }
*/


    }
}
