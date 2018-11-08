package com.jbalceda;

public abstract class Animal {
    private String name;

    public Animal(String newName){
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
    public abstract void breath();


}
