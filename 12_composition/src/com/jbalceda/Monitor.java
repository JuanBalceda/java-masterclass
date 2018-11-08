package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int Size;
    private Resolution native_resolution;

    public Monitor(String model, String manufacturer, int size, Resolution native_resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        Size = size;
        this.native_resolution = native_resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at: "+x+","+y+" in color: "+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return Size;
    }

    public Resolution getNative_resolution() {
        return native_resolution;
    }
}
