package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BankAccount interbank = new BankAccount("200-53964851-0-37",
//                                                3000.00,
//                                                "Juan Balceda",
//                                                "juanbalceda@gmail.com",
//                                                "964399766");

        BankAccount interbank = new BankAccount();

        interbank.depositFunds(300);
        interbank.depositFunds(200);
        interbank.depositFunds(500);
        System.out.println("Balance: "+interbank.getBalance());
        interbank.depositFunds(1000);
        System.out.println("Balance: "+interbank.getBalance());
        interbank.withdrawFunds(1000);
        System.out.println("Balance: "+interbank.getBalance());
        interbank.withdrawFunds(2000);
        System.out.println("Balance: "+interbank.getBalance());
        System.out.println("Customer: "+interbank.getCustomer_name()+
                            "\nEmail: "+interbank.getCustomer_email()+
                            "\nPhone: "+interbank.getCustomer_phone());
    }
}
