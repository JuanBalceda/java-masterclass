package com.jbalceda.timb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian",8,12);
        //        theatre.getSeats();
        if (theatre.reserveSeat("H11")){
            System.out.println("Please Pay");
        }else {
            System.out.println("Sorry, seat is taken");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());

        Collections.sort(priceSeats,theatre.PRICE_ORDER);
        printList(priceSeats);
        /*
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else {
            System.out.println("Seat already reserved");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy: ");
        printList(seatCopy);

        System.out.println("Printing theatre.seat: ");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min: "+minSeat.getSeatNumber());
        System.out.println("Max: "+maxSeat.getSeatNumber());


        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy: ");
        printList(theatre.seats);
        */
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber()+" "+seat.getPrice());
        }
        System.out.println("\n==================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list){
        for (int i=0; i < list.size()-1;i++){
            for (int j=i+1; j<list.size();j++){
                Collections.swap(list,i,j);
            }
        }
    }
}
