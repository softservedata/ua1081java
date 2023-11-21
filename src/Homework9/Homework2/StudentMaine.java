package Homework9.Homework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentMaine {
    public static void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = student.averageGrades();
            if (average < 3) {
                iterator.remove();
            } else {
                student.course++;
            }
        }
    }
    public static void printStudents (List<Student> students, int course){
        System.out.println("Students in course " + course + ":");
        for (Student student : students){
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "202 A", 2, List.of(4, 5, 3, 2, 5)));
        studentList.add(new Student("Boris", "401 A", 4, List.of(4, 5, 5, 3, 4)));
        studentList.add(new Student("Anatoliy", "201 B", 2, List.of(3, 3, 4, 2, 2)));
        studentList.add(new Student("Vasiliy", "100 A", 1, List.of(4, 5, 4, 2, 5)));
        studentList.add(new Student("Igor", "101 B", 1, List.of(3, 5, 3, 2, 4)));
        studentList.add(new Student("Andriy", "402 B", 4, List.of(4, 5, 3, 4, 5)));

        System.out.println("Initial list of students:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " Course - " + student.getCourse());
        }
        removeLowPerformingStudents(studentList);

        System.out.println("List after removing students:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " Course - " + student.getCourse());
        }
    }
}
