package com.softserve.HomeWorks.HomeWork03Ex3;
import java.util.Scanner;
class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(){
        return java.time.Year.now().getValue() - birthYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output(){
        System.out.println("Name: " + firstName + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln){
        if (fn != null && !fn.isEmpty()){
            this.firstName =fn;
        }
        if (ln != null && !ln.isEmpty()){
            this.lastName = ln;
        }
    }
}

public class Main {
    public static void main(String[] args){
        Person[] people = new Person[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < people.length; i++){
            people[i] = new Person();
            System.out.println("Enter information for person " + (i + 1) + ":");
            people[i].input();
        }

        System.out.println("\nInformation about people:");
        for (Person person : people){
            person.output();

        }
    }
}
