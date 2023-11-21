package Homework10;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int targetCourse) {
        System.out.println("Student in course " + targetCourse + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student next) {
        return this.name.compareTo(next.getName());
    }

    public static void sortByCourse(List<Student> students) {
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getCourse(), s2.getCourse()));
    }
    private static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + ", Course - " + student.getCourse());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        students.add(new Student("David", 3));
        students.add(new Student("Alisa", 5));
        students.add(new Student("Boris", 2));
        students.add(new Student("Vova", 1));
        students.add(new Student("Irina", 4));

        char endAndPrintList;
        do {
            System.out.println("Enter a number of cource:");
            int numOfCource = scanner.nextInt();
            printStudents(students, numOfCource);
            System.out.println("Do you want to perform the operation again? (y/n):");
            endAndPrintList = scanner.next().charAt(0);
        } while (Character.toLowerCase(endAndPrintList) == 'y');
        System.out.println("Students sorted by name: ");
        Collections.sort(students);
        printList(students);

        System.out.println("Students sorted by course:");
        Student.sortByCourse(students);
        printList(students);
    }
}
