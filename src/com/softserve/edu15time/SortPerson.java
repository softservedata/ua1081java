package com.softserve.edu15time;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name);
    }

    public static int compareByAge(Person a, Person b) {
        return a.age.compareTo(b.age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n\tPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class SortPerson {
    public static void main(String[] args) {
        Person[] persons = {new Person("Ivan", 34),
                new Person("Vasyl", 29),
                new Person("Olga", 26),
                new Person("Anna", 41)};

        //1
//        System.out.println("Original: " + Arrays.toString(persons));
//        Arrays.sort(persons, new Comparator<Person>() {
//            public int compare(Person o1, Person o2) {
//                return -o1.getAge() + o2.getAge();
//            }
//        });
//        System.out.println("Sorted: " + Arrays.toString(persons));

        //2
//        System.out.println("Original: " + Arrays.toString(persons));
//        Arrays.sort(persons, (p1, p2) -> Person.compareByName(p1, p2));
//        System.out.println("Sorted: " + Arrays.toString(persons));

        //3
        System.out.println("Original: " + Arrays.toString(persons));
        Arrays.sort(persons, Person::compareByAge);
        System.out.println("Sorted: " + Arrays.toString(persons));
    }

}
