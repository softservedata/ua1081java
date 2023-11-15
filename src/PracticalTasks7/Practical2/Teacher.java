package PracticalTasks7.Practical2;

public class Teacher extends Staff{
    final String TYPE_PERSON;

    public Teacher(String name, String typePerson) {
        super(name);
        TYPE_PERSON = typePerson;
    }


    @Override
    public void print() {
        System.out.println("I am a " + name + " and i am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Salary of teacher - 18650 \u20B4");

    }
}
