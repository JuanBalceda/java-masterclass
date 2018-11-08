package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ram_slots;
    private int card_slots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ram_slots, int card_slots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ram_slots = ram_slots;
        this.card_slots = card_slots;
        this.bios = bios;
    }

    public void loadProgram(String program_name){
        System.out.println("Program: "+program_name+" is loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRam_slots() {
        return ram_slots;
    }

    public int getCard_slots() {
        return card_slots;
    }

    public String getBios() {
        return bios;
    }
}
