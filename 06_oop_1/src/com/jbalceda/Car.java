package com.jbalceda;

/**
 * Created by jbalceda on 5/29/17.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public String getModel(){
        return this.model;

    }

    public void setModel(String new_model){
        String valid_model = new_model.toLowerCase();
        if (valid_model.equals("carrera")) {
            this.model = new_model;
        }else{
            this.model = "Unknown";
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int new_doors) {
        this.doors = new_doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int new_wheels) {
        this.wheels = new_wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String new_engine) {
        this.engine = new_engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String new_colour) {
        this.colour = new_colour;
    }
}
