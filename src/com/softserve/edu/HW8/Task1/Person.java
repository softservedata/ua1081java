package com.softserve.edu.HW8.Task1;

abstract class Person implements Cloneable{
    protected FullName fullName;
    protected int age;

    public Person(FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return "First name: " + fullName.getFirstName() +
        ", Last name: " + fullName.getLastName() + 
        ", Age: " + age;  
    }
    public abstract String activity();

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
