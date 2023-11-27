package com.softserve.practicaltask09_map.task01;

import java.util.HashMap;
import java.util.Map;


import static com.softserve.practicaltask09_map.task01.UtilityForMap.provideMoreComprehensiveInfo;

public class MyMapTask01 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(25, "Orest");
        employeeMap.put(2, "Pavlo");
        employeeMap.put(36, "Olha");
        employeeMap.put(4, "Artem");
        employeeMap.put(5, "Olha");
        employeeMap.put(6, "Pavlo");
        employeeMap.put(7, "Roman");
        employeeMap.put(8, "Sofia");
        employeeMap.put(9, "Daryna");
        employeeMap.put(10, "Oleh");
        System.out.println(employeeMap);

        UtilityForMap.findUserById(employeeMap);
        UtilityForMap.findUserByName(employeeMap);

//       Task 2** If desired, you can make the previous task more challenging by selecting one or more of the
//        following options:
//          • Before adding ID-name pairs to the map, it is recommended to perform a check for
//        duplicate values. If duplicates are found, the user should be notified and the addition of data
//        to the map should be halted.
//          • In order to provide a more comprehensive record, the user should be prompted to input
//        additional information, such as position, salary, and date of birth, in addition to the ID and
//        name. This information should then be displayed on the screen when the map is output.
//          • To enable the editing of existing data, such as name, position, and salary, the user should be
//        prompted to input the ID of the record they wish to modify, as well as the updated data. The
//        updated map should then be displayed.
//          • For improved usability, the map should be sortable by various criteria, such as ID, name, and
//        position. The user should be prompted to enter the desired sorting criterion, and the sorted
//        map should then be displayed on the screen.


        System.out.println("Additional task1 practical task 2**");
        System.out.println();
        if (UtilityForMap.checkDuplicateValues(employeeMap, "Olha") != null) {
            employeeMap.put(11, "Olha");
        }
        if (UtilityForMap.checkDuplicateValues(employeeMap, "Serhii") != null) {
            employeeMap.put(11, "Serhii");
        }
        System.out.println(employeeMap);
        System.out.println();


        System.out.println("Additional task2 practical task 2**");
        Map<Integer, Employee> updatedMap = provideMoreComprehensiveInfo(employeeMap);
        for (Map.Entry<Integer, Employee> entry : updatedMap.entrySet()) {
            System.out.println("Id : " + entry.getKey() + entry.getValue());
        }


        System.out.println("Additional task3 practical task 2**");
        UtilityForMap.editEmployeeData(updatedMap);
        for (Map.Entry<Integer, Employee> entry : updatedMap.entrySet()) {
            System.out.println("Id : " + entry.getKey() + entry.getValue());
        }


        System.out.println("Additional task4 practical task 2**");
        UtilityForMap.sortMapByDifferentCriteria(updatedMap);

    }
}
