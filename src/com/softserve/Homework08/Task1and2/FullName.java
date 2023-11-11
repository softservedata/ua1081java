package com.softserve.Homework08.Task1and2;

public class FullName implements Cloneable{
    private String firstName;
    private String lastName;
    public FullName(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        FullName fullName = (FullName)super.clone();
        return fullName;
    }
}
