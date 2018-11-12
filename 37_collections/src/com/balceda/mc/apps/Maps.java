package com.balceda.mc.apps;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> languajes = new HashMap<>();

        if (languajes.containsKey("Java")) {
            System.out.println("Java alreaady in the map");
        } else {
            languajes.put("Java", "A compiled high level, object-orientated, plataform independant languaje");
        }

        languajes.put("Python", "An interpreted high level, object-orientated with dynamic semantics");
        languajes.put("JavaScript", "An object-oriented computer programming language commonly used to create interactive effects within web browsers.");
        languajes.put("SQL", "Stands for Structured Query Language. SQL is used to communicate with a database. According to ANSI (American National Standards Institute), it is the standard language for relational database management systems.");

        if (languajes.containsKey("Java")) {
            System.out.println("Java already in the map");
        } else {
            languajes.put("Java", "This course is about Java");
        }

        if (languajes.remove("Python", "A data science language")) {
            System.out.println("Python removed");
        } else {
            System.out.println("Python not removed, key/value pair not found");
        }

        if (languajes.replace("SQL","Database manager","Database Manager languaje ")){
            System.out.println("SQL was replaced");
        }else {
            System.out.println("SQL was not replaced");
        }

        languajes.replace("Scala", "A modern programming language that incorporates object-oriented and functional language procedures and features.");

         printMap(languajes);
    }

    public static void printMap(Map<String, String> map){
        System.out.println("====================");
        for (String key : map.keySet()) {
            System.out.println(key + ":\t" + map.get(key));
        }
        System.out.println("====================");
    }
}
