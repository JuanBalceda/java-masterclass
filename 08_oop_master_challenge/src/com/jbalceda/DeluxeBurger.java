package com.jbalceda;

/**
 * Created by jbalceda on 6/14/17.
 */
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String name, String bread_roll_tipe, int meat_size, double base_price) {
        super(name, bread_roll_tipe, meat_size, base_price);
        super.setAditional1("Chips");
        super.setAditional2("Drink");
    }

    @Override
    public String addAditional(String aditional, double price) {
        System.out.println("No aditionals allowed");
        return "addAditional() is disabled";
    }

    @Override
    public void getBill() {
        super.getBill();
    }
}
