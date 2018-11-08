package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class Room {
    private Door door;
    private Bed bed;
    private Window window;

    public Room(Door door, Bed bed, Window window) {
        this.door = door;
        this.bed = bed;
        this.window = window;
    }

    public void cleanRoom(){
        window.openTheWindow();
    }

//    public Door getDoor() {
//        return door;
//    }
//
//    public Bed getBed() {
//        return bed;
//    }
//
//    public Window getWindow() {
//        return window;
//    }
}
