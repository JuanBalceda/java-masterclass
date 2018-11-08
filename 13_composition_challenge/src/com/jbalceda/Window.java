package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class Window {
    private int number;
    private String material;
    private Dimension window_dimension;

    public Window(int number, String material, Dimension window_dimension) {
        this.number = number;
        this.material = material;
        this.window_dimension = window_dimension;
    }

    public void openTheWindow(){
        System.out.println("Opening the window...");
    }

    public int getNumber() {
        return number;
    }

    public String getMaterial() {
        return material;
    }

    public Dimension getWindow_dimension() {
        return window_dimension;
    }
}
