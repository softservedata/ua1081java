package com.softserve.edu.HW6.Task1;

abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public Bird(boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    abstract void fly();
}
