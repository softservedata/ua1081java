package com.softserve.edu11;

import static java.lang.StringTemplate.STR;

public class StringDemo {
    public static void main(String[] args) {
//        String str = "blablabla";
//        System.out.printf("%s'%n", str);
//        System.out.printf("%20s'%n", str);
//        System.out.printf("%-20s'%n", str);

        String str1 = """
                     line1
                         line2 
                             line3\
                line4
                                     line5   \s            
                     """;
        System.out.println(str1);
        String name = "Olha";
        int count = 2;
        String str4 = STR."\{count++}, \{count++}";
        System.out.println(str4);
        String str2 = STR."Created by \{name}";
        System.out.println(str2);
    }
}
