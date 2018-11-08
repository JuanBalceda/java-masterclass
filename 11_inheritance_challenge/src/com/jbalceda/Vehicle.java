package com.jbalceda;

/**
 * Created by jbalceda on 6/1/17.
 */
public class Vehicle {
    private String power;
    private String track;

    public Vehicle(String power, String track) {

        this.power = power;
        this.track = track;
    }

    public void move(int speed){
        System.out.println("Vehicle.move() was called\n");
        System.out.println("Vehicle is moving at "+speed);
    }

    public String getPower() {
        return power;
    }

    public String getTrack() {
        return track;
    }

}
