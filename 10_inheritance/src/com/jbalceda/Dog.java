package com.jbalceda;

/**
 * Created by jbalceda on 6/1/17.
 */
public class Dog extends Animal {
    private String dog_name;
    private int legs;
    private int teeth;
    private String color;


    public Dog() {
    }

    public Dog(String name, int size, int weight, String dog_name,int legs,int teeth,String color) {
        super(name, 1, 1, size, weight);
        this.dog_name = dog_name;
        this.legs = legs;
        this.teeth = teeth;
        this.color = color;
    }

    private void chew(){
        System.out.println("Dog.chew() was called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() was called.");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() was called.");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() was called.");
        move(10);
    }

    private void moveLegs(){
        System.out.println("Dog.moveLegs() was called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() was called.");
        super.move(speed);
        moveLegs();
    }
}
