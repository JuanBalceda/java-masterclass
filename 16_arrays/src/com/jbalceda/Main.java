package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] my_array = new int[25]; //= new int[10];
//        my_array[5] = 15;

//        int[] my_array = {1,2,3,4,5,6,7,8,9,10};
//
//        double[] my_double_array = new double[10];
//
//        System.out.println(my_array[5]);

        for(int i = 0; i < my_array.length; i++){
            my_array[i] = i*10;
        }

        printArray(my_array);

    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element "+i+", value is: "+array[i]);
        }
    }
}
