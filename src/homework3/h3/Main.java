package homework3.h3;

import java.util.Scanner;

public class Main {

    public static Scanner SCANNER = new Scanner(System.in);//can be lowercase

  public static void main(String[] args) {

      Person person1 = new Person();
      Person.input(person1);
      Person.output(person1);


      Person person2 = new Person();
      Person.input(person2);
      Person.output(person2);

      Person person3 = new Person();
      Person.input(person3);
      Person.output(person3);

      Person person4 = new Person();
      Person.input(person4);
      Person.output(person4);

      Person person5 = new Person();
      Person.input(person5);
      Person.output(person5);
      person1.changeName();











  }

 }