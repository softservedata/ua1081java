package com.softserve.edu.HW6.Task1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("I can not fly!");
        //throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    
}
