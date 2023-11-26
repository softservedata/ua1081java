package com.softserve.homework08_list;

import com.softserve.homework08_list.task01.CollectionListUtility;
import com.softserve.homework08_list.task02.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork08Demo {
    public static void main(String[] args) {

//        Task 01 Declare collection myCollection of 10 integers and fill it (from the console or random).
//              • Swap the maximum and minimum elements in the list.
//              • Insert a random three-digit number before the first negative element of the list
//              • Insert a zero between all neighboring elements collection myCollection with different signs
//              • Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
//        list2 in reverse order.
//              • In a list myCollection remove the last even element (if there are even elements in the list). If
//        there is no such element, display a message.
//              • Remove from the list myCollection the element following the first minimum. If the minimum
//        element is the last one, nothing needs to be removed.
//        Use one or more of the next: List, ArrayList, LinkedList

        System.out.println("Original list: " + CollectionListUtility.createList());
        CollectionListUtility.swapMaxMinElementInList();
        CollectionListUtility.insertRandomThreeDigitNumberBeforeFirstNegativeElement(123);
        CollectionListUtility.insertZeroBetweenAllNeighboringElementsWithDifferentSigns();
        CollectionListUtility.copyElementsFromCollectionToNewList();
        CollectionListUtility.removeLastEvenElement();
        CollectionListUtility.removeFromListElementFollowingFirstMin();

//        Task 02 Create a class called Student which includes the following fields: name, group, course, and
//        grades in different subjects. Create a collection that holds all objects. Write a methods that:
//                   o removes students with a grade point average of less than 3. If a student's average score is
//        3 or higher, then they will be automatically promoted to the next course level.
//                   o printStudents(List<Student> students, int course) which takes a list of students and a
//        course number as inputs. This method should print out the names of the students who
//        are enrolled in the specified course number to the console.
//                  • In main() method create collection and output result.

        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "ua22", 2, List.of(5.5, 3.3, 2.5)));
        students.add(new Student("Ivan", "ua21", 2, List.of(2.2, 3.0, 2.5)));
        students.add(new Student("Olha", "ua22", 3, List.of(5.5, 4.3, 5.5)));
        students.add(new Student("Yurii", "ua21", 1, List.of(4.5, 3.9, 4.5)));
        students.add(new Student("Lilya", "ua22", 2, List.of(2.5, 2.9, 2.5)));
        students.add(new Student("Oleh", "ua21", 3, List.of(5.5, 4.3, 3.5)));
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
        Student.removeStudentsWithGradeLesThree(students);
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("**********");

        Student.printStudents(students, 4);
    }
}
