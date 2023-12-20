package com.softserve.edu.HW8.Task1;

public class Student extends Person {
    private int course;
    
    Student(FullName fullName, int age, int course){
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info(){
        return "First name: " + fullName.getFirstName() +
        ", Last name: " + fullName.getLastName() + 
        ", Age: " + age +
        ", Course: " + course;  
    }

    @Override
    public String activity() {
        return "I study at university.";
    }

    public void setCourse(int course) {
        this.course = course;
    }

    


}
