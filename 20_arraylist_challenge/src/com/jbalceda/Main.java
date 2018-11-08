package com.jbalceda;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("964 997 666");
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        startPhone();
        printActions();

        while (!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    shutdownPhone();
                    quit = true;
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone : ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if (myPhone.addNewContact(newContact)){
            System.out.println("New contact added.\nName: "+name+"\nPhone: "+phone);
        }else {
            System.out.println("Cannot add, "+name+" already on file.");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = myPhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter phone : ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newPhone);
        if (myPhone.updateContact(existingContact,newContact)){
            System.out.println("\nSuccessfully updated record");
        }else {
            System.out.println("\nError updating record.");
        }
    }
    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = myPhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        if(myPhone.removeContact(existingContact)){
            System.out.println("\nSuccessfully deleted");
        }else {
            System.out.println("\nError deleting contact");
        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = myPhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("\nName: "+existingContact.getName()+"\nPhone: "+existingContact.getPhone());
    }
    private static void startPhone(){
        System.out.println("Starting phone...");
    }
    private static void shutdownPhone(){
        System.out.println("\nShutting down phone...");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - to shutdown\n"+
                          "1 - to print contacts\n" +
                          "2 - to add a new contact\n" +
                          "3 - to update an existing contact\n" +
                          "4 - to remove an existing contact\n" +
                          "5 - to query if a contact exists\n" +
                          "3 - to to print a list of available actions\n");
        System.out.println("Choose your action: ");
    }
}
