package com.udogan;

import java.util.ArrayList;
import java.util.Collection;

public class LeagueTable<T extends Team> implements Comparable {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public void addteam(T team){
        teams.add(team);
    }

    public void getRanking(){

    }

    public void getTeamlist(){
        for (int i = 0; i < this.teams.size() ; i++) {
            System.out.println(teams.get(i));
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
