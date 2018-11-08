package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Door my_door = new Door("wood",new Dimension(150, 200,10),"white");
        Window my_window = new Window(2, "steel", new Dimension(300, 150, 20));
        Bed my_bed = new Bed("King", "Paraiso", new Dimension(200,200,40));

        Room my_room = new Room(my_door, my_bed, my_window);

        my_room.cleanRoom();
    }
}
