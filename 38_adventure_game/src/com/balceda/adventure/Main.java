package com.balceda.adventure;

import com.balceda.adventure.classes.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You're sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You're standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You're at the top of a hill"));
        locations.put(3, new Location(3, "You're inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You're in a valley beside a stream"));
        locations.put(5, new Location(5, "You're in the forest"));

        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("W", 2);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are: ");
            for (String exit : exits.keySet()) {
                System.out.print(" · " + exit);
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            String goTo;
            if (direction.toLowerCase().contains("north") || direction.equalsIgnoreCase("n")) {
                goTo = "N";
                if (validateDirection(exits, goTo)) {
                    loc = exits.get(goTo);
                } else {
                    System.out.println("You cannot go in that direction");
                }
            } else if (direction.toLowerCase().contains("west") || direction.equalsIgnoreCase("w")) {
                goTo = "W";
                if (validateDirection(exits, goTo)) {
                    loc = exits.get(goTo);
                } else {
                    System.out.println("You cannot go in that direction");
                }
            } else if (direction.toLowerCase().contains("east") || direction.equalsIgnoreCase("e")) {
                goTo = "E";
                if (validateDirection(exits, goTo)) {
                    loc = exits.get(goTo);
                } else {
                    System.out.println("You cannot go in that direction");
                }
            } else if (direction.toLowerCase().contains("south") || direction.equalsIgnoreCase("s")) {
                goTo = "S";
                if (validateDirection(exits, goTo)) {
                    loc = exits.get(goTo);
                } else {
                    System.out.println("You cannot go in that direction");
                }
            } else if (direction.toLowerCase().contains("quit") || direction.equalsIgnoreCase("q")) {
                loc = 0;
            }
        }
        /*
        // Split method example
        String road = "You're standing at the end of a road before a small brick building";
        String building = "You're inside a building, a well house for a small spring";

        String[] result = road.split(" ");
        for (String p : result){
            System.out.println(p);
        }
        String[] result2 = building.split(", ");
        for (String p : result2){
            System.out.println(p);
        }
        */
    }

    public static boolean validateDirection(Map<String, Integer> exits, String direction) {
        if (exits.containsKey(direction)) {
            return true;
        } else {
            return false;
        }
    }
}
