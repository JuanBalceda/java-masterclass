package com.jbalceda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the size of the array:\n");
        int size = input.nextInt();
        int[] array = new int[size];
        array = getIntegers(array);

        printArray(array);

//        sortArray(array);
//
//        newSortArray(array);

        resizeArray(array);


    }

    private static void resizeArray(int[] resizable_array) {
        System.out.println("Enter new size: ");
        int new_size = input.nextInt();
        int[] original_array = resizable_array;

        resizable_array = new int[new_size];
        if(resizable_array.length >= original_array.length){
            for (int i = 0; i < original_array.length; i++) {
                resizable_array[i] = original_array[i];
            }
        }else {
            for (int i = 0; i < resizable_array.length; i++) {
                resizable_array[i] = original_array[i];
            }
        }
        printArray(resizable_array);

    }

    private static void newSortArray(int[] new_sortable_array){
        int[] sorted_array = Arrays.copyOf(new_sortable_array,new_sortable_array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < (new_sortable_array.length-1); i++){
                if(new_sortable_array[i] < new_sortable_array[i+1]){
                    temp = new_sortable_array[i];
                    new_sortable_array[i] = new_sortable_array[i+1];
                    new_sortable_array[i+1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("The array has a new order.\n");
        for (int i = 0; i<new_sortable_array.length; i++) {
            System.out.println("Element " + (i + 1) + " has the value: "+new_sortable_array[i]);
        }

    }

    private static void sortArray(int[] sortable_array) {
        Arrays.sort(sortable_array);

        System.out.println("The array has a new order.\n");
        for (int i = 0; i<sortable_array.length; i++) {
            System.out.println("Element " + (i + 1) + " has the value: "+sortable_array[i]);
        }
    }

    public static int[] getIntegers(int[] input_array){
        for (int i = 0; i<input_array.length; i++) {
            System.out.println("Enter " + (i + 1) + " value:");
            input_array[i] = input.nextInt();
        }
        return input_array;
    }

    public static void printArray(int[] printable_array){
        for (int i = 0; i<printable_array.length; i++) {
            System.out.println("Element " + (i + 1) + " has the value: "+printable_array[i]);
        }
    }
}
