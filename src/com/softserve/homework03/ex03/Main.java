package com.softserve.homework03.ex03;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();

        p5.changeName("Jack", "Smith");
        p5.output();
    }
}
