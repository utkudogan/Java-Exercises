package com.udogan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Player utku = new Player("Utku", 95, 90);
        System.out.println(utku);
        saveObject(utku);

        utku.setHitPoint(98);
        System.out.println(utku);
        utku.setWeapon("Kürdan");
        saveObject(utku);
        //loadObject(utku);
        System.out.println(utku);

        Monster canavar = new Monster("Öcü", 45, 76);
        System.out.println(canavar);
        saveObject(canavar);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println( "Choose\n" +
                "1 to enter a string\n" +
                "0 to quit"
                );

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    quit= true;
                    break;
                case 1 :
                    System.out.println("Enter a string ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToload){
        ArrayList<String> values = readValues();
        objectToload.read(values);
    }
}
