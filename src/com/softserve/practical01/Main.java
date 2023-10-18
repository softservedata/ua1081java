package com.softserve.practical01;

public class Main {

    public static void main(String[] args) {
        System.out.print("0123456789");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\rABC");
    }

}
