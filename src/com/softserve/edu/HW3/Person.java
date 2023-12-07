package com.softserve.edu.HW3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private static String firstName;
    private static String lastName;
    private static int birthYear;

    public Person(){
        Person.firstName = "noName";
        Person.lastName = "noLastName";
    }

    public Person(String firstName, String lastName){
        Person.firstName = firstName;
        Person.lastName = lastName;
    }

    public static void getAge(){
        int currentYear = Year.now().getValue();
        System.out.println(currentYear - birthYear);
    }

    public void output(){
        System.out.println("firstName: " + firstName + "\n" +
                            "lastName: " + lastName + "\n" +
                            "birthYear: 3" + birthYear);
        
    } 
    public void input() {
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter first name: ");
            String fn = sc.nextLine();
            setFirstName(fn);
            System.out.print("Enter last name: ");
            String ln = sc.nextLine();
            setLastName(ln);
            System.out.print("Enter date of birth: ");
            setBirthYear(sc.nextInt());
    }
    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public int getBirthYear(){return birthYear;}

    public void setFirstName(String firstName){Person.firstName = firstName;}

    public void setLastName(String lastName){Person.lastName = lastName;}

    public void setBirthYear(int birthYear){Person.birthYear = birthYear;}

    public static void changeName(String fn, String ln){
        Person.firstName = fn;
        Person.lastName = ln;
    }

}
