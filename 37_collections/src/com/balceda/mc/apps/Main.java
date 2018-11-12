package com.balceda.mc.apps;

import com.balceda.mc.classes.Theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);

        //theatre.getSeats();
        if (theatre.reserveSeat("D12")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        /*
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        // Collections.reverse(seatCopy);
        // System.out.println("Printing seatCopy");
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy: ");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        //printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min: " + minSeat.getSeatNumber());
        System.out.println("Max: " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy: ");
        printList(seatCopy);
        */


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        Collections.sort(priceSeats,theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {
        System.out.println("\n==================================");
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println("\n==================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0)
                    Collections.swap(list, i, j);
            }
        }
    }
}
