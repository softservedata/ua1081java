package com.softserve.edu11;

public class StringTest {
    public static void main(String[] args) {
//        String s1 = " \t hello   \n\n";
//        String s3 = "hel".concat("lo");
//        final String hel = "hel";
//        final String ol = "lo";
//        String s4 = hel + ol;
//
//        String s2 = new String("hello").intern();
//        // System.out.println(s1.equals(s2));
//     //   System.out.println(s1 == s3);
////        Integer i1 = 129;
////        Integer i2 = 129;
////        System.out.println(i1 == i2);
//        System.out.println("'" + s1 + "'");
//        System.out.println("'" + s1.trim() + "'");
//        System.out.println("'" + s1.strip() + "'");
//        System.out.println("'" + s1.stripLeading() + "'");
//        System.out.println("'" + s1.stripTrailing() + "'");
//        String s5 = "hello hi";
//        String s6 = s5.replace('h','H');
//        String s7 = s5.replaceAll("h","a");
//
//        System.out.println(s6);
//        System.out.println(s7);
//        System.out.println(toTitleCase("hello hi"));
        String a = "welcome to Java";
        String A = "A";
        String b = "welcome";
//        System.out.println(a.equals(A));
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(A));
        System.out.println(a.compareTo(b));
        String[] arr = a.split(" ");
        for(String w : arr){
            System.out.println(w);
        }
       // System.out.println(a.compareToIgnoreCase(A));


}

    public static String toTitleCase(String s){
        return Character.toTitleCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
}
