/*
2. Create a Student class with an int field that matches the course the student is taking.
• In the Student class:
o create a constructor with parameters to initialize all fields in the class;
o override the info() method (which would also add course information to the previous line);
o override the activity() method from the Person class. The activity() method should return a string value that is the
type of activity for the corresponding Person subtype, for example for a student - this could be the value "I study at university".
• In the main() method, create two instances of the Student class and output information about them by calling the
appropriate methods info() and activity().
• Create one more instance of Student class by cloning the first student, change a course for this object and output
full information about created students.
 */

package Homework_07_Ivan;

public class Student extends Person {
    private int course;

    public Student cloneWithNewCourse(int newCourse) {
        return new Student(new FullName(getFullName().getFirstName(), getFullName().getLastName()), getAge(), newCourse);
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Course: " + course);
    }

    @Override
    public String activity() {
        return "I study at the university";
    }

    public static void main(String[] args) {
        FullName name1 = new FullName("Jake", "Paulayn");
        FullName name2 = new FullName("Lana", "Mayor");

        Student student1 = new Student(name1, 21, 1);
        Student student2 = new Student(name2, 23, 2);

        Student student3 = student1.cloneWithNewCourse(3); // Assuming 3 is the new course

        student1.info();
        System.out.println(student1.activity());
        student2.info();
        System.out.println(student2.activity());
        student3.info();
        System.out.println(student3.activity());

    }
}
