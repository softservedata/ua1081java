package Homework8;
abstract class Person implements Cloneable{
    private FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public String info(){
        return "First name: " + fullName.getFirstName() +
                "\nLast name: " + fullName.getLastName() +
                "\nAge: " + getAge();
    }
    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
