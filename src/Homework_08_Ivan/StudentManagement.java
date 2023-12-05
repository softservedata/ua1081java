package Homework_08_Ivan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Add student objects to the collection
        students.add(new Student("John", "Group1", 1, List.of(3, 4, 5)));
        students.add(new Student("Alice", "Group2", 2, List.of(2, 2, 5)));
        students.add(new Student("Bob", "Group1", 3, List.of(3, 1, 2)));
        students.add(new Student("Emily", "Group2", 1, List.of(4, 5, 4)));
        students.add(new Student("Michael", "Group1", 2, List.of(4, 3, 5)));
        students.add(new Student("Sophia", "Group2", 3, List.of(3, 3, 1)));

        List<Student> removedStudents = removeUnderperformingStudents(students);
        printStudents(students, 2);
        System.out.println("\nStudents removed:");
        for (Student student : removedStudents) {
            System.out.println("Name: " + student.getName());
            System.out.println("Group: " + student.getGroup());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Grades: " + student.getGrades());
            System.out.println();
        }
    }

    private static List<Student> removeUnderperformingStudents(List<Student> students) {
        List<Student> removedStudents = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = student.calculateAverageGrade();
            if (average < 3) {
                removedStudents.add(student); // Додаємо студента до списку видалених
                iterator.remove(); // Видаляємо студента з основного списку
            } else {
                student.promoteToNextCourse(); // Підвищуємо курс студента
            }
        }
        return removedStudents;
    }

    private static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                // Виводимо інформацію про студента, включаючи його ім'я, групу, курс та оцінки
                System.out.println("Name: " + student.getName());
                System.out.println("Group: " + student.getGroup());
                System.out.println("Course: " + student.getCourse());
                System.out.println("Grades: " + student.getGrades());
                System.out.println();
            }
        }
    }
}
