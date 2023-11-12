package com.softserve.edu.lesson_7_Nested.practice.practice_1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department.Address address = new Department.Address("Lviv","Naukova",22);
        Department first = new Department("Office",address);

        Department second = (Department) first.clone();
        second.getAddress().setCity("New York");

        System.out.println(first);
        System.out.println(second);
    }
}
