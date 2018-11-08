package com.jbalceda;

/**
 * Created by jbalceda on 6/6/17.
 */
public class PC {
    private Case the_case;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case the_case, Motherboard motherboard, Monitor monitor) {
        this.the_case = the_case;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        the_case.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,20, "Orange");

    }
//
//    private Case getThe_case() {
//        return the_case;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
