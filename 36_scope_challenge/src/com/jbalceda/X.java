package com.jbalceda;

public class X {
    private  int x;

    public X(int x) {
        this.x = x;
    }

    public void x(){
        for (int x = 0 ; x < 13; x++){
            System.out.println(x+" times "+this.x+": "+x*this.x);
        }
    }
}
