package com.udogan;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Süperlig");
        Team<FootballPlayer> galatasaray = new Team<>("Galatasaray");
        FootballPlayer onyekuru = new FootballPlayer("Onyekuru");
        galatasaray.addPlayer(onyekuru);
        Team<FootballPlayer> fener = new Team<>("Fener");
        Team<FootballPlayer> besiktas = new Team<>("Beşiktaş");
        Team<FootballPlayer> kayserispor = new Team<>("Kayserispor");

        footballLeague.addteam(galatasaray);
        footballLeague.addteam(fener);
        footballLeague.addteam(besiktas);
        footballLeague.addteam(kayserispor);

        galatasaray.matchResult(fener, 3,1);
        galatasaray.matchResult(besiktas,2,2);
        galatasaray.matchResult(kayserispor,2,1);
        kayserispor.matchResult(fener, 3,1);
        kayserispor.matchResult(besiktas,2,2);
        besiktas.matchResult(fener,2,2);

        footballLeague.getRanking();
    }
}
