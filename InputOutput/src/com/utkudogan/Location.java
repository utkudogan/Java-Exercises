package com.utkudogan;

import java.io.Serializable;
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.LinkedHashMap;
import java.util.Map;

public class Location implements Serializable{
=======
=======
>>>>>>> 4f530de57514fc7ccc488be7342a4ad304a1788e
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 */
public class Location implements Serializable {
<<<<<<< HEAD
>>>>>>> 4f530de57514fc7ccc488be7342a4ad304a1788e
=======
>>>>>>> 4f530de57514fc7ccc488be7342a4ad304a1788e
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    private long serialVersionUID = 1L;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null) {
            this.exits = new LinkedHashMap<String, Integer>(exits);
        } else {
            this.exits = new LinkedHashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new LinkedHashMap<String, Integer>(exits);
    }
    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
