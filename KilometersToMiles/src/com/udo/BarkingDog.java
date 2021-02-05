package com.udo;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(hourOfDay<0){
            return false;
        }
        if(barking){
            if ((hourOfDay%24) < 8 || (hourOfDay%24) > 22){
                return true;
            }
            return false;
        }

        return false;
    }
}
