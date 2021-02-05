package com.udogan;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);


        System.out.println(adelaideCrows.numberOfPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> cimbom = new Team<>("Re re re");
        cimbom.addPlayer(beckham);
        Team<FootballPlayer> galatasaray = new Team<>("Galatasaray");
        FootballPlayer onyekuru = new FootballPlayer("Onyekuru");
        galatasaray.addPlayer(onyekuru);
        Team<FootballPlayer> fener = new Team<>("Fener");
        Team<FootballPlayer> besiktas = new Team<>("Beşiktaş");

        galatasaray.matchResult(fener, 3,1);
        galatasaray.matchResult(besiktas,2,2);
        galatasaray.matchResult(besiktas,2,1);

        System.out.println("Rankings");
        System.out.println(galatasaray.getName() + ": " + galatasaray.ranking());
        System.out.println(besiktas.getName() + ": " + besiktas.ranking());
        System.out.println(fener.getName() + ": " + fener.ranking());

        System.out.println(galatasaray.compareTo(fener));
        System.out.println(fener.compareTo(galatasaray));
    }
}
