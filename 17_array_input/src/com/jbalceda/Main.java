package com.jbalceda;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] my_integers = getIntegers(5);

        for(int i = 0; i < my_integers.length; i++){
            System.out.println("Element "+i+" typed value was: "+my_integers[i]);
        }
        System.out.println("Average is "+getAverage(my_integers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scan.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
