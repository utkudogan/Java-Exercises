package com.utkudogan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Atatürk", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        Collections.reverse(seatCopy);
        System.out.println("Printing seat copy");
        printList(seatCopy);

        Collections.shuffle(seatCopy);
        System.out.println("Printing seat copy");
        printList(seatCopy);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat: list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("========================================================");
    }
}
