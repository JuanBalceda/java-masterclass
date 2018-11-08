package com.jbalceda;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Juan");
//        ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(50));

        Integer newInteger = new Integer(26);
        Double  newDouble = new Double(42.96d);

/*        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i=0; i<10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i=0; i<10; i++){
            System.out.println(i+" --> "+integerArrayList.get(i).intValue());
        }
*/

/*
        Integer myIntValue = 95; // Integer.valueOf(95);
        int myInt = myIntValue; // myInt.intValue();

        Double myDoubleValue = 95.20d; // Double.valueOf(95);
        double myDouble = myDoubleValue; // myDouble.doubleValue();
*/

        ArrayList<Double> myDoubleValues = new ArrayList<>();
/*
        for (double dbl = 0.0; dbl<=10.0; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for (int i=0;i<myDoubleValues.size();i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i+" -> "+value);
        }
*/
        for (double dbl = 0.0; dbl<=10.0; dbl += 0.5){
            myDoubleValues.add(dbl);
        }
        for (int i=0;i<myDoubleValues.size();i++){
            double value = myDoubleValues.get(i);
            System.out.println(i+" -> "+value);
        }

    }
}
