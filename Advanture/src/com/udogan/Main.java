package com.udogan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locations = new HashMap<Integer,Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0,new Location(0,"a"));
        locations.put(1,new Location(1,"b"));
        locations.put(2,new Location(2,"c"));
        locations.put(3,new Location(3,"d"));
        locations.put(4,new Location(4,"e"));
        locations.put(5,new Location(5,"f"));

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());

            if (loc == 0) {
                break;
            }

            loc = scanner.nextInt();
            if (!locations.containsKey(loc)) {
                System.out.println("can't go in that direction.");
            }
        }
    }



}
