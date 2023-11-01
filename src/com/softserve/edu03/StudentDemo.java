package com.softserve.edu03;

class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Olha","Shu", 32);
        Student student2 = new Student("Olha","Shu", 32);
        Student student3 = student2;
        student3.setAge(33);

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }
}

