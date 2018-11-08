package com.jbalceda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Customer customer = new Customer("Juan", 50.70d);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18d);
        System.out.println("Balance for customer "+customer.getName()+" is "+customer.getBalance());
*/

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(7);

        for (int i=0; i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }

        System.out.println("-------------------------");
        intList.add(1,10);

        for (int i=0; i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }

    }
}
