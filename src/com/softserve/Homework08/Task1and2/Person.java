package com.softserve.Homework08.Task1and2;

public abstract class Person implements Cloneable{
    private FullName fullName;
    private int age;
    public Person(FullName fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }
    public String info(){
        return "First name: "+fullName.getFirstName()+", Last name: "+fullName.getLastName()+", Age: "+age;
    }
    public abstract String activity();

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.fullName = (FullName) clone.fullName.clone();
        return clone;
    }
}
