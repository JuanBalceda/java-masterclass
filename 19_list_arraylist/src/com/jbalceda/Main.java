package com.jbalceda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList myGroceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myGroceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.addAll(myGroceryList.getArrayList());

        ArrayList<String> nextArray = new ArrayList<String>(myGroceryList.getArrayList());

        String[] newArray = new String[myGroceryList.getArrayList().size()];
        newArray = (String[]) myGroceryList.getArrayList().toArray(newArray);

    }

    public static void printInstructions(){
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");

    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        myGroceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please enter the current item name: ");
        String currentItem = scanner.nextLine();
        System.out.println("Please enter the new grocery item: ");
        String newItem = scanner.nextLine();
        myGroceryList.modifyGroceryItem(currentItem,newItem);
    }

    public static void removeItem(){
        System.out.println("Please enter the item to remove: ");
        myGroceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void searchItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (myGroceryList.onFile(searchItem)){
            System.out.printf("Found "+ searchItem+"\n");
        }else {
            System.out.printf(searchItem + " not found\n");
        }
    }


}
