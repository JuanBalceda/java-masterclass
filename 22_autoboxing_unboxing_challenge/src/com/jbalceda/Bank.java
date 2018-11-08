package com.jbalceda;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> myBranches;

    public Bank(String name) {
        this.name = name;
        this.myBranches = new ArrayList<>();
    }
    //Add a new branch
    public boolean addBranch(String newName){
        if (findBranch(newName) == null){
            this.myBranches.add(new Branch(newName));
            return true;
        }
        return false;
    }
    //Add a customer tu a branch with initial transaction
    public boolean addBranchCustomer(String branchName, String customerName, double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            return existingBranch.addCustomer(customerName,initialAmount);
        }
        return false;
    }
    //Add transaction for an existing customer in a branch
    public boolean addBranchCustomerTransaction(String branchName, String customerName, double amount){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            return existingBranch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for (int i=0; i<this.myBranches.size();i++){
            Branch checkBranch = this.myBranches.get(i);
            if (checkBranch.getName().equals(branchName)){
                return checkBranch;
            }
        }
        return null;
    }
    //Show list of customers of a branch and optionally show list of transactions
    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null){
            System.out.println("Customer details for branch "+existingBranch.getName());
            ArrayList<Customer> branchCustomers = existingBranch.getMyCustomers();
            for (int i=0; i<branchCustomers.size();i++){
                Customer branchcustomer = branchCustomers.get(i);
                System.out.println("Customer: "+branchcustomer.getName());
                if (showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchcustomer.getMyTransactions();
                    for(int j=0; j<transactions.size();j++){
                        System.out.println("["+(j+1)+"] Amount: "+transactions.get(j));
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }
    //Demonstrate Autoboxing and Unboxing in the code
    //Add data validation
}
