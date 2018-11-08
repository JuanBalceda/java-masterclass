package com.jbalceda;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Song> myPlaylist = new LinkedList<>();

        Album album1 = new Album("motivational");
        album1.addSong("I'm Yours", "4:50 min");
        album1.addSong("Somewhere over the rainbow", "4:00 min");
        album1.addSong("Living in the moment", "3:30 min");

        Album album2 = new Album("rock");
        album2.addSong("In the End", "4:00 min");
        album2.addSong("We will rock you", "3:00 min");
        album2.addSong("Welcome to the jungle", "4:20 min");

        myPlaylist.add(album1.getSong("Somewhere over the rainbow"));
        myPlaylist.add(album2.getSong("Welcome to the jungle"));
        myPlaylist.add(album2.getSong("In the End"));
        myPlaylist.add(album1.getSong("Living in the moment"));

        play(myPlaylist);
    }

    private static void play(LinkedList<Song> playlist) {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        printOptions();
        boolean movingForward = true;
        ListIterator<Song> i = playlist.listIterator();

        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing...");
            System.out.println("Song: " + i.next().toString());
        }

        while (!quit) {
            System.out.println("\nEnter and option:");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("\nGood Bye! ;)");
                    quit = true;
                    break;
                case 1:
                    if (!movingForward) {
                        if (i.hasNext()) {
                            i.next();
                        }
                        movingForward = true;
                    }
                    if (i.hasNext()) {
                        System.out.println("Now playing...");
                        System.out.println("Song: " + i.next().getTitle());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        movingForward = false;
                    }
                    break;
                case 2:
                    if (movingForward) {
                        if (i.hasPrevious()) {
                            i.previous();
                        }
                        movingForward = false;
                    }
                    if (i.hasPrevious()) {
                        System.out.println("Now playing...");
                        System.out.println("Song: " + i.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        movingForward = true;
                    }
                    break;
                case 3:
                    System.out.println("Now playing...");
                    if (i.hasPrevious()) {
                        i.previous();
                        Song mySong = i.next();
                        System.out.println("Song: " + mySong.getTitle() + " - Duration: " + mySong.getDuration());
                    } else if (i.hasNext()) {
                        i.next();
                        Song mySong = i.previous();
                        System.out.println("Song: " + mySong.getTitle() + " - Duration: " + mySong.getDuration());
                    } else if (playlist.isEmpty()) {
                        System.out.println("PlayList is empty");
                    } else {
                        Song mySong = playlist.getFirst();
                        System.out.println("Song: " + mySong.getTitle() + " - Duration: " + mySong.getDuration());
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    printOptions();
                    break;
            }

        }
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        ListIterator<Song> i = playlist.listIterator();
        while (i.hasNext()) {
            Song mySong = i.next();
            System.out.println("Song: " + mySong.getTitle() + " - Duration: " + mySong.getDuration());
        }
    }

    private static void printOptions() {
        System.out.println("Select one of the following options: " +
                "\n0 - To quit." +
                "\n1 - To skip forward to the next song." +
                "\n2 - To skip backwards to the previous song." +
                "\n3 - To re-play the current song." +
                "\n4 - To List all songs in the Playlist." +
                "\n5 - To print options again.");
    }
}
