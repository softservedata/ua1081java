package com.softserve.edu.HW6.Task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(),
                        new Swallow(),
                        new Penguin(),
                        new Kiwi()
        };


        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.feathers + ", Lays Eggs: " + bird.layEggs);
            System.out.println(); 
        }
    }
    
}
