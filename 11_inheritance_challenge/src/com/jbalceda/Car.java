package com.jbalceda;

/**
 * Created by jbalceda on 6/1/17.
 */
public class Car extends Vehicle {

    private String model;
    private int year;
    private String manufacturer;
    private int wheels;
    private int room;

    public Car(String model, int year, String manufacturer, int room) {
        super("fuel", "ground");
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.wheels = 4;
        this.room = room;
    }

    public void turnRight(){
        System.out.println("turnRight() was called.");
        handSteering("Right");
    }

    public void turnLeft(){
        System.out.println("turnLeft() was called.");
        handSteering("Left");
    }


    private void handSteering(String direction){
        System.out.println("handSteering() was called.\n");
        System.out.print("Turning "+direction);
    }

    public void accelerate(int speed){
        System.out.println("Car.accelerate() was called.");
        super.move(speed);
    }

    public void stop(int speed){
        System.out.println("Car.stop() was called");
        super.move(speed);
    }

    public void changeGears(){
        System.out.println("Car.changeGears() was called.");
    }

    public int getWheels() {
        return wheels;
    }

    public int getRoom() {
        return room;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
