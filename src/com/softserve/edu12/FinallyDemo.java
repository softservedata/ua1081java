package com.softserve.edu12;

public class FinallyDemo {
    public static void main(String[] args) {
        String str = greet();
        System.out.println(str);
        foo();
    }

    static String greet() {
        try {
            return "Good morning";
        } finally {
            return "Good evening";
        }
    }

    static String foo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i" + i);
            try {
                if (i == 2) {
                    break;
                }
                System.exit(0);
            } finally {
                continue;
            }
        }
        return "";
    }
}
