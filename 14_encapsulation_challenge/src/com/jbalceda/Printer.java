package com.jbalceda;

/**
 * Created by jbalceda on 6/7/17.
 */
public class Printer {
    private int toner_level;
    private int pages_printed;
    private boolean is_duplex;

    public Printer(int toner_level, int pages_printed, boolean is_duplex) {
        this.toner_level = toner_level;
        this.pages_printed = pages_printed;
        this.is_duplex = is_duplex;
    }

    public void recharge(int toner){
        if((toner_level+toner)<=100){
            for(int i = 0; i < toner; i++){
                this.toner_level += 1;
            }
            System.out.println("New Toner level: "+toner_level);
        }else {
            System.out.println("Too much Toner. Max. capability: 100");
        }
    }

    public void print(int pages){
        if(this.toner_level >= pages && this.is_duplex){
            this.pages_printed += pages;
            this.toner_level -= pages;
            System.out.println("Pages printed: "+pages_printed+" on duplex.");
        }else if(this.toner_level >= pages){
            this.pages_printed += pages;
            this.toner_level -= pages;
            System.out.println("Pages printed: "+pages_printed+".");
        }else {
            System.out.println("Not enough Toner. Toner Level:"+toner_level);
        }
    }

    public int getToner_level() {
        return toner_level;
    }

    public int getPages_printed() {
        return pages_printed;
    }

    public boolean isIs_duplex() {
        return is_duplex;
    }
}
