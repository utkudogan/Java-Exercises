package com.udogan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> implements Comparable {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addteam(T team){
        if (teams.contains(team)) {
            System.out.println("Bu takım zaten var");
            return false;
        }
        teams.add(team);
        return true;
    }

    public void getRanking(){
        System.out.println("--Rankings--");
        Collections.sort(teams);
        for (int i = 0; i < this.teams.size() ; i++) {
            System.out.println(teams.get(i).getName() + ": " + teams.get(i).ranking());
        }
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
