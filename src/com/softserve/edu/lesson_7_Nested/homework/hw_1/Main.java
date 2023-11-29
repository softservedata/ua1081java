package com.softserve.edu.lesson_7_Nested.homework.hw_1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Studnent studnent1 = new Studnent(new FullName("Igor", "Bogdan"), 21, 4);
        Studnent studnent2 = new Studnent(new FullName("Nazar", "Buk"), 19, 2);

        studnent1.info();
        System.out.println(studnent1.activity());
        studnent2.info();
        System.out.println(studnent2.activity());

        Studnent student3 = (Studnent) studnent1.clone();
        student3.setCourse(1);
        student3.getFullName().setName("Vova");
        student3.getFullName().setSurname("Koval");
        student3.setAge(18);
        student3.info();
        System.out.println(student3.activity());
    }
}
//In your Person and Student classes, the info() method is defined as a void method (public void info()),
// which prints the information directly. However, based on your description, info() should return a string.
// Therefore, it should be defined as public String info() and return the information instead of printing it.
//In the Student class, the info() method should be overridden to add course information.
// Your implementation calls the superclass's info() method and then prints the course, which is a practical approach.
//
//It looks like there's a small typo in your class name Studnent :)) It should be Student.
//
//
