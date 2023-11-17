package homework9.h2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 1, 1, 4, 3));
        students.add(new Student("Eva", 2, 2, 5, 4));
        students.add(new Student("Taras", 3, 4, 3, 3));
        students.add(new Student("Ivan", 4, 3, 2, 2));
        // System.out.println(students);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your curse: ");
        int course = scanner.nextInt();
        for (Student student : students) {
            student.printStudents(students, course);
            break;
        }

        for (Student student : students) {
            student.removeStudent(students);
            break;
        }

        System.out.println(students);

    }
}






