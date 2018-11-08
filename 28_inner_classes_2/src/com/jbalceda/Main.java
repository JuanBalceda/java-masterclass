package com.jbalceda;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
	// write your code here

        //INNER CLASS
        /*
        Gearbox mcLaren = new Gearbox(6);
    //    Gearbox.Gear gears = mcLaren.new Gear(1,12.3);
    //    System.out.println(gears.speed(1000));
        mcLaren.addGear(1,5.3);
        mcLaren.addGear(2,10.6);
        mcLaren.addGear(3,15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(5000));
        */

        //LOCAL CLASS
        /*
        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked.");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        */

        //ANONYMOUS CLASS
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked.");
            }
        });

        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choise = scan.nextInt();
            switch (choise){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }

}
