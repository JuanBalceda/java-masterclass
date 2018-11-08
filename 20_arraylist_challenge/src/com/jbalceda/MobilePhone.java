package com.jbalceda;


import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1)+". "+
                                this.myContacts.get(i).getName() + ": "+
                                this.myContacts.get(i).getPhone());
        }
    }
    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.printf("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println(oldContact+" was not found.");
            return false;
        }
        this.myContacts.set(position,newContact);
        System.out.printf(oldContact.getName()+" was replaced with "+newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){
            System.out.printf(contact+" was not found.");
            return false;
        }
        this.myContacts.remove(position);
        System.out.printf(contact.getName()+" was deleted.");
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
}
