/* 1. Create a FullName class with the firstName and lastName fields of type String, which would correspond to
the principle of encapsulation.
        • Create an abstract Person class with fullName field of type FullName and age of type int.
        • In the Person class, create:
        o  a constructor public Person(FullName fullName, int age) ;
        o  info() method, which will return a string in the format
        "First name: <firstName>, Last name: <lastName>, Age: <age>"
        o  an abstract public activity() method with a String return type. */

package Homework_07_Ivan;

public class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age);
    }

    abstract public String activity();
}