package PracticalTasks7.Practical2;

public class Student extends Person{
    final String TYPE_PERSON;
    public Student(String name, String typePerson) {
        super(name);
        TYPE_PERSON = typePerson;
    }

    @Override
    public void print() {
        System.out.println("I am a " + name + " and i am a " + TYPE_PERSON);
    }
}
