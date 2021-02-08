package com.utkudogan;

import java.util.HashMap;

public class MapProgram {
    public static void main(String[] args) {
        java.util.Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level language");
        languages.put("Python", "lan2");
        languages.put("Algol", "lan3");
        languages.put("JavaScript", "lan4");
        languages.put("R", "lan5");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java already exits");
        }else{
            languages.put("Java", "lan6");
        }

        System.out.println(languages.put("Java", "lan1"));

        for (String key: languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
