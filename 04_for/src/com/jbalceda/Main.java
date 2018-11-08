package com.jbalceda;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f",calcInterest(10000.0,i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at "+i+"% interest = " + String.format("%.2f",calcInterest(10000.0,i)));
        }
        int test_number = 4;
        if (isPrime(test_number))
            System.out.println("Es un numero primo");
        else
            System.out.println("No es un numero primo");
*/
        int begin;
        int end = 91;
        int prime_numbers = 0;
        for (begin = 15; begin < end; begin++){
            if(isPrime(begin)){
                System.out.println("Is a prime number: "+begin);
                prime_numbers++;
                if (prime_numbers == 10){
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
    }

    public static double calcInterest(double amount, double interest_rate){
        return amount * (interest_rate / 100);
    }

    //Validate prime numbers
    public static boolean isPrime(int n){
        if(n == 1)
            return false;
/*
        for (int i = 2; i <= n/2; i ++){
            if (n % i == 0)
                return false;
        }
*/
        //Optimized
        for (int i = 2; i <= (long) Math.sqrt(n); i ++){
            if (n % i == 0)
                return false;
        }

        return  true;
    }

}
