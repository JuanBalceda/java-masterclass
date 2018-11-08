package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog bulldog = new Dog("Boli");

        bulldog.eat();
        bulldog.breath();

        Bird crow = new Parrot("greenie");

        crow.eat();
        crow.breath();
        crow.fly();

        Bird penguin = new Penguin("Tux");

        penguin.fly();
    }
}
