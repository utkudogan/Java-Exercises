package com.udogan;

import java.util.ArrayList;

public class Theatre {
    private final String theatreName;
    private ArrayList<Seat> seatArray;

    public Theatre(String theatreName, int numRows, int seatPerRow) {
        this.theatreName = theatreName;

        for (int row= 0; row < numRows; row++){
            for (int seatNumber = 1; seatNumber <= seatPerRow; seatNumber++) {
                char first = 'A' + row;
                Seat seat = new Seat(('A' + row)+seatNumber);
                seatArray.add(seat);
            }
        }
    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved = false;

        private Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve(){
            return true;
        }

        public boolean cancel(){
            return true;
        }
    }
}
