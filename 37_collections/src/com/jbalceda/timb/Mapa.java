package com.jbalceda.timb;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<String,String> languajes = new HashMap<>();
        languajes.put("Java","a compiled high level, object-orientated, plataform independant languaje");
        languajes.put("Python","an interpreted high level, object-orientated with dynamic semantics");

        if (languajes.containsKey("Java")){
            System.out.println("Java alreaady in the map");
        }else{
            languajes.put("Java","This course is about Java");
        }

        languajes.remove("Python");

        for (String key: languajes.keySet()){
            System.out.println(key+" : "+languajes.get(key));
        }
    }
}
