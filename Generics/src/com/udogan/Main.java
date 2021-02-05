package com.udogan;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addplayer(joe);


        System.out.println(adelaideCrows.numberOfPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addplayer(pat);

        Team<SoccerPlayer> cimbom = new Team<>("Re re re");
        cimbom.addplayer(beckham);
    }
}
