package com.jbalceda;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit,"Lima");
        addInOrder(placesToVisit,"Cuzco");
        addInOrder(placesToVisit,"Trujillo");
        addInOrder(placesToVisit,"Arequipa");
        addInOrder(placesToVisit,"Tacna");
        addInOrder(placesToVisit,"Pucallpa");
//        printList(placesToVisit);
/*
        placesToVisit.add("Lima");
        placesToVisit.add("Cuzco");
        placesToVisit.add("Trujillo");
        placesToVisit.add("Arequipa");
        placesToVisit.add("Tacna");
        placesToVisit.add("Pucallpa");
*/
//        addInOrder(placesToVisit,"Tacna");
        addInOrder(placesToVisit,"Puno");
        printList(placesToVisit);
/*        placesToVisit.add(1,"Iquitos");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);*/
        visit(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("-----------------------");
    }
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
//                Equal, do not add.
                System.out.println(newCity+" is already included as a destination.");
                return false;
            }else if (comparison>0){
//                new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison<0){
//                move to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        boolean goingForward = true;

        if (cities.isEmpty()){
            System.out.println("No cities in the itenerary.");
            return;
        }else {
            System.out.println("Now visiting... "+ listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacations over.");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting... "+listIterator.next());
                    }else {
                        System.out.println("Reached the end of the line.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting... "+listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the cities.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }
    private static void printMenu(){
        System.out.println("Press: "+
                            "\n0 - To exit."+
                            "\n1 - To visit next city."+
                            "\n2 - To visit previous city."+
                            "\n3 - To print options."+
                            "\nChoose an options:");
    }
}
