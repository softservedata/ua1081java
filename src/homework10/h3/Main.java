package homework10.h3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 1));
        students.add(new Student("Eva", 2));
        students.add(new Student("Taras", 1));
        students.add(new Student("Ivan", 4));
        students.add(new Student("Petro", 5));


        System.out.println("Enter your curse: ");
        Scanner scanner = new Scanner(System.in);
        int course = scanner.nextInt();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
                student.printStudents(students, course);
                break;
            }
        students.sort(new Student.ByName());
        System.out.println(students);
        students.sort(new Student.ByCourse());
        System.out.println(students);
        }

    }
