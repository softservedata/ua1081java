package Homework3.Homework3;

import java.time.Year;
import java.util.Locale;
import java.util.Scanner;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private int birthYear;

    public PersonInfo() {
    }

    public PersonInfo(String firstName, String lastName) {
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
        return getBirthYear();
    }
    public void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fn = scanner.nextLine();
        setFirstName(fn);
        System.out.println("Enter the second name: ");
        String ln = scanner.nextLine();
        setLastName(fn);
        System.out.println("Enter a date of birth: ");
        setBirthYear(scanner.nextInt());
    }
    public void output(){
        System.out.println("Person info: \n First Name: " +  getFirstName() + "\n Last Name: "+ getLastName() + "\n Birth Year: " + getAge());
    }

    public static void main(String[] args) {
        PersonInfo firstPerson = new PersonInfo();
        firstPerson.setFirstName("Elton");
        firstPerson.setLastName("Jhon");
        firstPerson.setBirthYear(1947);
        firstPerson.output();

        PersonInfo secondPerson = new PersonInfo();
        secondPerson.setFirstName("Ray");
        secondPerson.setLastName("Charls");
        secondPerson.setBirthYear(1930);
        secondPerson.output();

        PersonInfo thirsPerson = new PersonInfo();
        thirsPerson.setFirstName("Jason");
        thirsPerson.setLastName("Statham");
        thirsPerson.setBirthYear(1967);
        thirsPerson.output();

        PersonInfo fourPerson = new PersonInfo();
        fourPerson.setFirstName("Jessica");
        fourPerson.setLastName("Alba");
        fourPerson.setBirthYear(1981);
        fourPerson.output();

        PersonInfo fivePerson = new PersonInfo();
        fivePerson.input();
        fivePerson.output();

    }
}
