package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer hp = new Printer(100,0,true);

        hp.print(30);

        int actual_pages = hp.getPages_printed();
        System.out.println("Actual pages printed: "+actual_pages);

        hp.print(70);

        hp.recharge(30);
        hp.recharge(40);

        actual_pages = hp.getPages_printed();
        System.out.println("Actual pages printed: "+actual_pages);
        int actual_toner = hp.getToner_level();
        System.out.println("Actual  Toner Level: "+actual_toner);


    }
}
