package com.softserve.edu12;

public class Test {
    public static void main(String[] args) {
        String str = "null";
        System.out.println("Some text");
        System.out.println("It`s not error");
        try {
            System.out.println(str.length());
        } catch ( ArithmeticException | NullPointerException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
        ex.printStackTrace();
    }
        System.out.println("The End");
    }
}
