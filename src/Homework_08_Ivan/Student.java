
/*
2. Create a class called Student which includes the following fields: name, group, course, and grades in different subjects.
Create a collection that holds all objects. Write a methods that:
o removes students with a grade point average of less than 3.

If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
o printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs.
This method should print out the names of the students who are enrolled in the specified course number to the console.
• In main() method create collection and output result.
 */

package Homework_08_Ivan;



import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void promoteToNextCourse() {
        course++;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}

