package com.balceda;

import com.balceda.classes.DwarfPlanet;
import com.balceda.classes.HeavenlyBody;
import com.balceda.classes.Moon;
import com.balceda.classes.Planet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        // Valid before challenge

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 1.3);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new DwarfPlanet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
            for (HeavenlyBody planetMoon : planet.getSatellites()) {
                System.out.println("\t\t" + planetMoon.getKey());
            }
        }

        System.out.println("Mars");
        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        for (HeavenlyBody moons : body.getSatellites()) {
            System.out.println("\t" + moons.getKey());
        }

        // equals() and hasCode() methods
        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
    }
}
