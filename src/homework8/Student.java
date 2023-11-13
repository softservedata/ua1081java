package homework8;

public class Student extends Person implements Cloneable{
    private int course;



    public Student(FullName FullName, int age, int course) {
        super(FullName, age);
        FullName.getFirstName();
        this.course = course;

    }

    public int getCourse() {
        return course;
    }


    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }

    @Override
    public String activity() {
        return "I am study at university";
    }

    @Override
    public String info() {
        return "First name: " + getFullName().getFirstName() + ". Last name: "
                + getFullName().getLastName() + ". Age: " + getAge()
                + ". Course: " + getCourse();
    }
    public Object clone() throws CloneNotSupportedException {
        Student myClone = (Student) super.clone();
        return myClone;
    }
}
