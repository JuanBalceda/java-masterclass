package com.jbalceda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Player juan = new Player("JBalceda",20,500);
        System.out.println(juan.toString());
        saveObject(juan);

        juan.setHitPoints(30);
        System.out.println(juan);

        juan.setWeapon("Shotgun");
        saveObject(juan);

        loadObject(juan);

        System.out.println(juan);
        */

        ISavable wolf = new Monster("wolf", 10, 100);
        System.out.println(((Monster) wolf).getStrength());
        System.out.println(wolf.toString());
        saveObject(wolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose:\n"+
                            "1 to enter a String\n"+
                            "0 to exit");

        while (!quit){
            System.out.println("Choose an option:");
            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String:");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;


    }

    public static void saveObject(ISavable objectToSave){
        for (int i=0; i<objectToSave.write().size();i++){
            System.out.println("Saving...  "+objectToSave.write().get(i)+" to storage device");
        }
    }

    public static void loadObject(ISavable ObjectToLoad){
        ArrayList<String> values = readValues();
        ObjectToLoad.read(values);
    }
}
