package com.jbalceda;

public class Penguin extends Bird {

    public Penguin(String newName) {
        super(newName);
    }

    @Override
    public void fly() {
        System.out.println("Not good for that");
    }
}
