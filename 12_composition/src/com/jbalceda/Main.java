package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimension dimensions = new Dimension(20,20,5);
        Case the_case = new Case("220B","Dell","220",dimensions);
        Monitor the_monitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));
        Motherboard the_motherboard = new Motherboard("BJ-200", "Asus", 4,6,"2.44");

        PC my_pc = new PC(the_case,the_motherboard,the_monitor);

        my_pc.powerUp();

//        my_pc.getMonitor().drawPixelAt(1500,1200,"red");
//        my_pc.getMotherboard().loadProgram("Ubuntu 17.04");
//        my_pc.getThe_case().pressPowerButton();


    }
}
