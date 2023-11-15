package PracticalTasks7.Practical2;

abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}