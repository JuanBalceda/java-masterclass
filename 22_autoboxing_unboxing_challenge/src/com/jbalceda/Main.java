package com.jbalceda;

public class Main {

    public static void main(String[] args) {
        Bank myBank = new Bank("National Bank");
        myBank.addBranch("Lima");
        myBank.addBranchCustomer("Lima","Juan",2000.00d);
        myBank.addBranchCustomer("Lima","Key",1300.00d);
        myBank.addBranchCustomer("Lima","Daniel",1500.00d);
        myBank.addBranchCustomer("Lima","Carlos",2500.00d);

        myBank.addBranch("Arequipa");
        myBank.addBranchCustomer("Arequipa","Lucía",5000.00d);
        myBank.addBranchCustomer("Arequipa","Pío",2000.00d);
        myBank.addBranchCustomer("Arequipa","Mónica",12220.20d);

        myBank.addBranchCustomerTransaction("Lima","Juan",500.50d);
        myBank.addBranchCustomerTransaction("Arequipa","Lucía",268.75d);

//        myBank.listCustomers("Lima",false);
        myBank.listCustomers("Arequipa",true);
        myBank.addBranch("Pucallpa");

        if (!myBank.addBranchCustomer("Pucallpa","Lucía",5000.00d)){
            System.out.println("Branch doesn't exist.");
        }

        if (!myBank.addBranchCustomer("Lima","Juan",3000.52)){
            System.out.println("Customer already exists.");
        }
    }
}
