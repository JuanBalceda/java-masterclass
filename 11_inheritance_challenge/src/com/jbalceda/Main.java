package com.jbalceda;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SportCar my_car = new SportCar("LaFerrari Aperta",2017,"Ferrari",2,2800500.00);

//        my_car.changeGears();
//        my_car.accelerate(10);
//        my_car.turnRight();
//        my_car.turbo();
        System.out.println(my_car.getAll());
    }
}
