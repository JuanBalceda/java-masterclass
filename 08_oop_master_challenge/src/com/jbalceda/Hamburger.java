package com.jbalceda;

/**
 * Created by jbalceda on 6/14/17.
 */
public class Hamburger {
    private String name;
    private String bread_roll_tipe;
    private int meat_size;
    private String aditional1;
    private String aditional2;
    private String aditional3;
    private String aditional4;
    private double base_price;
    private double adicional_price;

    public Hamburger(String name, String bread_roll_tipe, int meat_size, double base_price) {
        this.name = name;
        this.bread_roll_tipe = bread_roll_tipe;
        this.meat_size = meat_size;
        this.base_price = base_price;
    }

    public String addAditional(String aditional, double price){
        if(getAditional1() == null){
            setAditional1(aditional);
            setAdicional_price(price);
            System.out.println(getAditional1()+" set as 01 adicional item.");
            return "addAditional() completed";
        }else if(getAditional2() == null){
            setAditional2(aditional);
            setAdicional_price(price);
            System.out.println(getAditional2()+" set as 02 adicional item.");
            return "addAditional() completed";
        }else if(getAditional3() == null){
            setAditional3(aditional);
            setAdicional_price(price);
            System.out.println(getAditional3()+" set as 03 adicional item.");
            return "addAditional() completed";
        }else if(getAditional4() == null){
            setAditional4(aditional);
            setAdicional_price(price);
            System.out.println(getAditional4()+" set as 04 adicional item.");
            return "addAditional() completed";
        }else {
            System.out.println("Aditional items limit reached.");
            return "addAditional() completed";
        }
    }

    public void getBill(){
        System.out.println("Burger name: "+getName());
        System.out.println("Bread: "+getBread_roll_tipe());
        switch (getMeat_size()) {
            case 0:
                System.out.println("Meat size: Small");
                break;
            case 1:
                System.out.println("Meat size: Medium");
                break;
            case 2:
                System.out.println("Meat size: Big");
                break;
            default:
                System.out.println("Not set.");
                break;
        }
        System.out.println("Base price: "+getBase_price());
        System.out.println("Aditionals: "
                            +getAditional1()+
                        ", "+getAditional2()+
                        ", "+getAditional3()+
                        ", "+getAditional4());
        System.out.println("Aditional price: "+getAdicional_price());
        System.out.println("Total: "+(getBase_price()+getAdicional_price()));
    }

    public String getName() {
        return name;
    }

    public String getBread_roll_tipe() {
        return bread_roll_tipe;
    }

    public int getMeat_size() {
        return meat_size;
    }

    public String getAditional1() {
        return aditional1;
    }

    public void setAditional1(String aditional1) {
        this.aditional1 = aditional1;
    }

    public String getAditional2() {
        return aditional2;
    }

    public void setAditional2(String aditional2) {
        this.aditional2 = aditional2;
    }

    public String getAditional3() {
        return aditional3;
    }

    public void setAditional3(String aditional3) {
        this.aditional3 = aditional3;
    }

    public String getAditional4() {
        return aditional4;
    }

    public void setAditional4(String aditional4) {
        this.aditional4 = aditional4;
    }

    public double getBase_price() {
        return base_price;
    }

    public double getAdicional_price() {
        return adicional_price;
    }

    public void setAdicional_price(double adicional_price) {
        this.adicional_price += adicional_price;
    }
}
