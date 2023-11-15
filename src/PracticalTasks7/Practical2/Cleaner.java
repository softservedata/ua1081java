package PracticalTasks7.Practical2;

public class Cleaner extends Staff{
    final String TYPE_PERSON;

    public Cleaner(String name, String typePerson) {
        super(name);
        TYPE_PERSON = typePerson;
    }

    @Override
    public void print() {
        System.out.println("I am a " + name + " and i am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Salary of cleaner - 9860 \u20B4");
    }
}
