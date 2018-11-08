package com.jbalceda;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> myTransactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.myTransactions = new ArrayList<>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount){
        this.myTransactions.add(amount);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Double> getMyTransactions() {
        return myTransactions;
    }
}
