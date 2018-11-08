package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("CARRERA");
        String my_model = porsche.getModel();
        System.out.println("My Car is model: "+my_model);

        porsche.setColour("Black");
        my_model = porsche.getColour();
        System.out.println("My Car is color: "+my_model);


    }
}
