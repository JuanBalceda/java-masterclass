package com.jbalceda;
class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("startEngine() method called from Car class.");
        System.out.println("Engine has started.");
    }

    public void accelerate(){
        System.out.println("accelerate() method called from Car class.");
        System.out.println("Car is accelerating.");
    }

    public void slowDown(){
        System.out.println("slowDown() method called from Car class.");
        System.out.println("Car is slowing down.");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
class Toyota extends Car{

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine() method called from Toyota class");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate() method called from Toyota class");
        super.accelerate();
    }

    @Override
    public void slowDown() {
        System.out.println("slowDown() method called from Toyota class");
        super.slowDown();
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Toyota toyota = new Toyota(10,"Station Vagon");
        toyota.startEngine();
        toyota.accelerate();
        toyota.slowDown();

        Ford ford = new Ford(10,"Station Vagon");
        ford.startEngine();
        ford.accelerate();
        ford.slowDown();

    }
}
