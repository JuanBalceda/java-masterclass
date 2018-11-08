package com.jbalceda;

/**
 * Created by jbalceda on 6/1/17.
 */
public class SportCar extends Car {

    private String type;
    private double price;

    public SportCar(String model, int year, String manufacturer, int room, double price) {
        super(model, year, manufacturer, room);
        this.type = "Sport";
        this.price = price;
    }

    public void turbo(){
        System.out.println("SportCar.turbo() was called.");
        accelerate(1000);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getAll(){
        String all = this.getManufacturer()+"\n"+this.getType()+"\n"+this.getModel()+"\n"+this.getYear()+"\n"+this.getPrice();
        return all;
    }
}
