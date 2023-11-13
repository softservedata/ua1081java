package homework8;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "First name: " + fullName.getFirstName() + ", " +
                "Last name: " + fullName.getLastName() + ", Age: " + getAge();
    }
    abstract public String activity();

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.fullName = (FullName) clone.fullName.clone();
        return clone;
    }
}
