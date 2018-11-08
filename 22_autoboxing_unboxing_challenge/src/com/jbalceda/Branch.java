package com.jbalceda;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> myCustomers;

    public Branch(String newName) {
        this.name = newName;
        this.myCustomers = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Customer> getMyCustomers() {
        return myCustomers;
    }
    //Add new customer
    public boolean addCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.myCustomers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }
    //Add initial transaction amount
    //Add additional transactions for customer/branch
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName){
        for (int i=0; i<this.myCustomers.size();i++){
            Customer checkCustomer = this.myCustomers.get(i);
            if (checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
    }
}
