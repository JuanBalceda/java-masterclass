package com.jbalceda;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*        int count = 0;
        while (count != 6){
            System.out.println("Count value is "+count);
            count++;
        }

        System.out.println("***********************");

        for (int i=0; i < 6; i++){
            System.out.println("Count value is "+i);
        }

        System.out.println("***********************");
        do {
            System.out.println("Count value is "+count);
            count++;

            if (count > 10){
                break;
            }
        }while (count != 6);

        System.out.println("***********************");

        System.out.println("Count value is "+count);
*/
        int number = 5;
        int even_numbers = 0;
        int finish_number = 20;
        while(number <= finish_number){
            if (!isEvenNumber(number)){
                number++;
                continue;
            }
            number++;
            even_numbers++;
            if(even_numbers >= 5)
                break;
        }
        System.out.println("There is "+even_numbers+" even numbers");
    }

    public static boolean isEvenNumber(int number){

        if((number % 2) == 0) {
            System.out.println(number + " is an even number");
            return true;
        }else {
//            System.out.println(number + " is not an even number");
            return false;
        }
    }
}
