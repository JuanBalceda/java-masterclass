package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class Bed {
    private String model;
    private String manufacturer;
    private Dimension bed_dimension;

    public Bed(String model, String manufacturer, Dimension bed_dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bed_dimension = bed_dimension;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getBed_dimension() {
        return bed_dimension;
    }
}
