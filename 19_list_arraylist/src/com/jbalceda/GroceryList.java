package com.jbalceda;

import java.util.ArrayList;

/**
 * Created by jbalceda on 7/16/17.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList getArrayList(){
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
        System.out.println("Item: "+item+" added");
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in your Grocery List.");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1)+" - "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findGroceryItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Item n° "+(position+1)+" has been modified.");
    }
    public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        String deletedItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(deletedItem+" has been removed from Grocery List.");
    }

    public boolean onFile(String searchItem){
        int position = findGroceryItem(searchItem);
        if (position >= 0){
            return true;
        }else {
            return false;
        }
    }

      int findGroceryItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
//        if(position >= 0){
//            System.out.println("Element: "+groceryList.get(position));
//            System.out.println("Element find in "+(position+1)+" position");
//            return groceryList.get(position);
//        }else {
//            return null;
//        }
    }
}
