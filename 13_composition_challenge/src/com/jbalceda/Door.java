package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class Door {
    private String material;
    private Dimension door_dimension;
    private String color;

    public Door(String material, Dimension door_dimension, String color) {
        this.material = material;
        this.door_dimension = door_dimension;
        this.color = color;
    }

    public void knockTheDoor(){
        System.out.println("Knocking the door...");
    }

    public String getMaterial() {
        return material;
    }

    public Dimension getDoor_dimension() {
        return door_dimension;
    }

    public String getColor() {
        return color;
    }
}
