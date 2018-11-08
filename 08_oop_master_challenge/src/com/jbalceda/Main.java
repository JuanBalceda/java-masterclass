package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Hamburger happy_box = new Hamburger("regular",0,10);
//
//        happy_box.addAditional("Tomato",2);
//        happy_box.addAditional("Letuce",1);
//        happy_box.addAditional("Cheese",5);
//        happy_box.addAditional("Bacon",6);
//
//        happy_box.getBill();
//
//        HealthyBurger veggie = new HealthyBurger(2,15);
//
//        veggie.addAditional("Tomato",2);
//        veggie.addAditional("Letuce",1);
//        veggie.addAditional("pickles",5);
//        veggie.addAditional("onios",6);
//        veggie.addAditional("olives",6);
//        veggie.addAditional("carrots",6);
//        veggie.addAditional("cabbage",6);
//
//        veggie.getBill();

        DeluxeBurger combo = new DeluxeBurger("Basic","regular",1,6);

        combo.addAditional("Tomato",2);
        combo.addAditional("Letuce",1);
        combo.addAditional("Cheese",5);
        combo.addAditional("Bacon",6);

        combo.getBill();

    }
}
