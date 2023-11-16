package com.softserve.homework07_inner_class_clon;

import com.softserve.homework07_inner_class_clon.task01.FullName;
import com.softserve.homework07_inner_class_clon.task01.Student;

public class HomeWork06Demo {
    public static void main(String[] args) throws CloneNotSupportedException {

//        Task 01 Create a FullName class with the firstName and lastName fields of type String,
//        which would correspond to the principle of encapsulation.
//          • Create an abstract Person class with fullName field of type FullName and age of type int.
//          • In the Person class, create:
//                  o a constructor public Person(FullName fullName, int age) ;
//                  o info() method, which will return a string in the format
//        "First name: <firstName>, Last name: <lastName>, Age: <age>"
//                  o an abstract public activity() method with a String return type.
//                Create a Student class with an int field that matches the course the student is taking.
//          • In the Student class:
//                  o create a constructor with parameters to initialize all fields in the class;
//                  o override the info() method (which would also add course information to the
//                previous line);
//                  o override the activity() method from the Person class. The activity() method should return
//        a string value that is the type of activity for the corresponding Person subtype,
//        for example for a student - this could be the value "I study at university".
//          • In the main() method, create two instances of the Student class and output information
//                about them by calling the appropriate methods info() and activity().
//          • Create one more instance of Student class by cloning the first student, change a course
//        for this object and output full information about created students.

        Student student1 = new Student(new FullName("Kate", "Yalanska"), 30, 5);
        Student student2 = new Student(new FullName("Marii", "Shelest"), 29, 3);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("\nInfo about: ");
        student1.info();
        System.out.println(student1.activity());
        System.out.println("\nInfo about: ");
        student2.info();
        System.out.println(student2.activity());
        System.out.println("\nInfo about: ");
        Student student3 = (Student) student1.clone();
        student3.setCourse(6);
        System.out.println(student3);
        System.out.println("\nInfo about: ");
        Student student4 = new Student(new FullName("Mike", "Yum"), 45, 1);
        Student copyStudent = (Student) student4.clone();
        System.out.println(copyStudent);
    }
}
