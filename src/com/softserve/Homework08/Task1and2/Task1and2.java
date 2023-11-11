package com.softserve.Homework08.Task1and2;

public class Task1and2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Petro","Petrenko"),20,2);
        Student student2 = new Student(new FullName("Ivan","Bobrenko"),18,1);
        System.out.println("\n Student 1:\n "+student1.info()+"\n Activity: "+student1.activity());
        System.out.println("\n Student 2:\n "+student2.info()+"\n Activity: "+student2.activity());
        Student student3 = (Student) student2.clone();
        student3.setCourse(4);
        System.out.println("\n Student 3:\n "+student3.info()+"\n Activity: "+student3.activity());
    }
}
