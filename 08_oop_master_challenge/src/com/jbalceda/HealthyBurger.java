package com.jbalceda;

/**
 * Created by jbalceda on 6/14/17.
 */
public class HealthyBurger extends Hamburger {

    private String aditional5;
    private String aditional6;


    public HealthyBurger(String name, int meat_size, double base_price) {
        super(name,"Brown rye bread roll", meat_size, base_price);
    }

    @Override
    public String addAditional(String aditional, double price) {
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
        }else if(getAditional5() == null){
            setAditional5(aditional);
            setAdicional_price(price);
            System.out.println(getAditional5()+" set as 05 adicional item.");
            return "addAditional() completed";
        }else if(getAditional6() == null){
            setAditional6(aditional);
            setAdicional_price(price);
            System.out.println(getAditional6()+" set as 06 adicional item.");
            return "addAditional() completed";
        }else {
            System.out.println("Aditional items limit reached.");
            return "addAditional() completed";
        }
    }

    @Override
    public void getBill() {
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
                ", "+getAditional4()+
                ", "+getAditional5()+
                ", "+getAditional6());
        System.out.println("Aditional price: "+getAdicional_price());
        System.out.println("Total: "+(getBase_price()+getAdicional_price()));
    }

    public String getAditional5() {
        return aditional5;
    }

    public void setAditional5(String aditional5) {
        this.aditional5 = aditional5;
    }

    public String getAditional6() {
        return aditional6;
    }

    public void setAditional6(String aditional6) {
        this.aditional6 = aditional6;
    }
}
