/* 3. Create a class named Student that stores information about the student's name and course.
        • The class should include properties to access these fields, a constructor with parameters,
        and a method called printStudents that takes a List of students and an Integer representing the course
        number as arguments.
        • This method should print the names of the students from the list who are enrolled in the specified
        course to the console using an iterator.
        • Additionally, add methods to compare students by name and by course.
        • In the main() method, create a List named "students" and add five different Student
        objects to it. Then, display the list of students sorted by name and sorted by course. */

package Homework_09_Ivan;

import java.util.List;

public class Student {

    private String studentName;
    private Integer course;

    public Student(String studentName, Integer course) {
        this.studentName = studentName;
        this.course = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void printStudents(List<Student> students, Integer courseNumber){
        for (Student student : students){
            if (courseNumber.equals(student.getCourse())){
                System.out.println(student.getStudentName());
            }
        }
    }

    public void printStudents(List<Student> students) {
        for (Student student : students){
            System.out.println(student.getStudentName());
        }
    }

    @Override
    public String toString() {
        return studentName + ", course: "+course;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        Student student2 = (Student) other;
        return (this.studentName.equals (student2.getStudentName()) && this.course.equals( student2.getCourse()));
    }
}
