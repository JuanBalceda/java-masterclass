package com.jbalceda;

public class Main {

    public static void main(String[] args) {
        String grade = "b";

        switch (grade.toUpperCase()){
            case "A":
                System.out.println("The character was "+grade);
                break;
            case "B":
                System.out.println("The character was "+grade);
                break;
            case "C": case "D": case "E":
                System.out.println("The character was "+grade);
                break;
            case "F":
                System.out.println("The character was "+grade);
                break;
            default:
                System.out.println("Not a grade, the input was "+grade);
                break;

        }
    }
}
