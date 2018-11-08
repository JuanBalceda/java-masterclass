package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class Case {
    private String model;
    private String manufacturer;
    private String power_supply;
    private Dimension dimensions;

    public Case(String model, String manufacturer, String power_supply, Dimension dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.power_supply = power_supply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power Button pressed...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPower_supply() {
        return power_supply;
    }

    public Dimension getDimensions() {
        return dimensions;
    }
}
