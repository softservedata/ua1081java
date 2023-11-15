package Homework8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Boris", "Buga"), 23, 4);
        Student student2 = new Student(new FullName("Alex", "Popov"), 21,2);
        System.out.println("Student1\n" + student1.info() + student1.activity());
        System.out.println("Student2\n" + student2.info() + student2.activity());
        Student student3 = (Student) student1.clone();
        student3.setCourse(1);
        System.out.println("Student Clone:\n" + student3.info() + student3.activity());


    }
}
