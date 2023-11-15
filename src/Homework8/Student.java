package Homework8;

public class Student extends Person implements Cloneable{
    public int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + "\nCourse: " + course;
    }

    @Override
    public String activity() {
        return "\nI study at university\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloneOfStudent = (Student) super.clone();
        cloneOfStudent.setCourse(course);
        return super.clone();
    }
}
