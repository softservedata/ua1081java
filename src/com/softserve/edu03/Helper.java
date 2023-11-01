package com.softserve.edu03;

public class Helper {
    private static String message;

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}

class Runner {
    public static void main(String[] args) {
        Helper.setMessage("Hello");
        Helper.print();

        Helper helper = new Helper();//do not create new object of Helper class in this case
        helper.setMessage("New");
    }
}

class Test {
    public static void main(String[] args) {
        int a = 37;
        int b = 24;
        if (a > 30 & (b = 72) < 50) {
            System.out.println("test");
        }

        System.out.println(a);
        System.out.println(b);
    }
}