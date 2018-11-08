package com.jbalceda;

/**
 * Created by jbalceda on 6/1/17.
 */
public class Animal {
    private String name;
    private int head;
    private int body;
    private int size;
    private int weight;

    public Animal() {
        this("Animal",1,1,0,0);
    }

    public Animal(String name, int head, int body, int size, int weight) {
        this.name = name;
        this.head = head;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() was called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() was called\n");
        System.out.println("Animal is moving at "+speed);
    }

    public String getName() {
        return name;
    }

    public int getHead() {
        return head;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
