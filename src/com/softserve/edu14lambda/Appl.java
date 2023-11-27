package com.softserve.edu14lambda;

interface Vehicle1 {
    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }

    default void print() {
        System.out.println("I am a vehicle!");
    }

}


public class Appl implements  Vehicle1 {

    public void my() {
        //Vehicle1.super.print();
        print();
    }

    public static void main(String[] args) {
        //Vehicle1.blowHorn();
        new Appl().my();
    }
}
