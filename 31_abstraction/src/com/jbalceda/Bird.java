package com.jbalceda;

public abstract class Bird extends Animal implements canFly{

    public Bird(String newName) {
        super(newName);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is pecking");
    }

    @Override
    public void breath() {
        System.out.println(getName()+" is breathing in and out, repeat.");
    }

}
