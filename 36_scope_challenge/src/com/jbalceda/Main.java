package com.jbalceda;

import java.util.Scanner;

public class Main {

    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number to multiply: ");
        int number = x.nextInt();
        X x = new X(number);
        x.x();
    }
}
