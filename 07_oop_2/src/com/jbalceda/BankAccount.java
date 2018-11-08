package com.jbalceda;

/**
 * Created by jbalceda on 5/30/17.
 */
public class BankAccount {
    private String account_number;
    private double balance;
    private String customer_name;
    private String customer_email;
    private String customer_phone;

    public BankAccount(){
        this("No account number", 0.00, "No name","No email", "No phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String account_number, double balance, String customer_name, String customer_email, String customer_phone){
        System.out.println("Constructor with parameters called");
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
    }

    public void depositFunds(double amount){
        System.out.println("Successful operation.");
        this.balance += amount;
    }

    public double withdrawFunds(double amount){
        if (this.balance < amount){
            System.out.println("Not enough cash.");
            return this.balance;
        }else {
            this.balance -= amount;
            System.out.println("Successful operation.");
            return this.balance;
        }
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }
}
