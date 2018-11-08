package com.jbalceda;

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine() method called from "+getClass().getSimpleName());
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate() method called from Ford class");
        super.accelerate();
    }

    @Override
    public void slowDown() {
        System.out.println("slowDown() method called from Ford class");
        super.slowDown();
    }
}

