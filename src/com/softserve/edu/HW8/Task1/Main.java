package com.softserve.edu.HW8.Task1;

public class Main {
    public static void main(String[] args) {
        Person per1 = new Student(new FullName("Max", "Payne"), 30, 1);
        Person per2 = new Student(new FullName("Lara", "Croft"), 25, 6);


        System.out.println("Person 1: \n" + per1.info() + "\n" + per1.activity() + "\n");
        System.out.println("Person 2: \n" + per2.info() + "\n" + per2.activity() + "\n");

        try {
            Student per3 = (Student) per1.clone();

            per3.setCourse(2);

            System.out.println("Person 3: \n" + per3.info() + "\n" + per3.activity() + "\n");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    
}
