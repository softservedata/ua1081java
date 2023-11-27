package com.softserve.practicaltask09_map.task01;

import java.util.*;
import java.util.function.Function;

public class UtilityForMap {


    public static void findUserById(Map<Integer, String> map) {
        Scanner scanner = new Scanner(System.in);
        int enteredId;
        do {
            System.out.println("Enter user ID: ");
            enteredId = scanner.nextInt();
            if (!map.containsKey(enteredId)) {
                System.out.println("User with this ID not found\n");
            } else {
                for (Iterator<Map.Entry<Integer, String>> i = map.entrySet().iterator(); i.hasNext(); ) {
                    Map.Entry<Integer, String> entry = i.next();
                    if (entry.getKey() == enteredId) {
                        System.out.println("Id: " + entry.getKey() + " name is " + entry.getValue());
                        break;
                    }
                }
            }
        } while (!map.containsKey(enteredId));

    }

    public static void findUserByName(Map<Integer, String> map) {
        Scanner scanner = new Scanner(System.in);
        String enteredName;
        do {
            System.out.println("Enter user name: ");
            enteredName = scanner.nextLine().toLowerCase();
            enteredName = enteredName.substring(0, 1).toUpperCase() + enteredName.substring(1);
            if (!map.containsValue(enteredName)) {
                System.out.println("User with this name not found\n");
            } else {
                for (Iterator<Map.Entry<Integer, String>> i = map.entrySet().iterator(); i.hasNext(); ) {
                    Map.Entry<Integer, String> entry = i.next();
                    if (entry.getValue().equals(enteredName)) {
                        System.out.println("Id: " + entry.getKey() + " name is " + entry.getValue());
                    }
                }
            }
        } while (!map.containsValue(enteredName));

    }

    public static Map<Integer, String> checkDuplicateValues(Map<Integer, String> map, String enteredName) {
        if (map.containsValue(enteredName)) {
            System.out.println("Entered name is duplicated: " + enteredName);
            return null;
        } else {
            return map;
        }
    }


    public static Map<Integer, Employee> provideMoreComprehensiveInfo(Map<Integer, String> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input additional information: ");
        Integer id = null;

        while (id == null) {
            System.out.println("Enter your ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        if (!map.containsKey(id)) {
            System.out.println("Employee with this ID not found\n");
            return Collections.emptyMap();
        }

        System.out.println("Enter your position: ");
        String position = scanner.nextLine();
        System.out.println("Enter your salary: ");
        double salary = 0;
        boolean validSalary = false;

        while (!validSalary) {
            try {
                salary = Double.parseDouble(scanner.nextLine());
                validSalary = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid salary.");
            }
        }

        System.out.println("Your birthDay: ");
        String dateOfBirth = scanner.nextLine();


        Map<Integer, Employee> map1 = new HashMap<>();


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Employee employee;
            if (entry.getKey() == id) {
                employee = new Employee(entry.getValue(), position, salary, dateOfBirth);
                map1.put(id, employee);
            } else {
                employee = new Employee(entry.getValue(), null, 0.0, null);
                map1.put(entry.getKey(), employee);
            }
        }
        return map1;
    }


    public static Map<Integer, Employee> editEmployeeData(Map<Integer, Employee> map) {
        Scanner scanner = new Scanner(System.in);
        Integer enteredId = null;
        while (enteredId == null) {
            System.out.println("Enter ID for employee you want to change: ");
            try {
                enteredId = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        if (!map.containsKey(enteredId)) {
            System.out.println("Employee with this ID not found\n");
            return Collections.emptyMap();
        }
        int menu = 0;
        while (true) {
            System.out.println("Select what you want to change in the data: 1- name, 2- position, 3- salary");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                        if (entry.getKey() == enteredId) {
                            System.out.println("Your name is " + entry.getValue().getName());
                            scanner.nextLine();
                            System.out.println("Entered your new name: ");
                            String updateName = scanner.nextLine();
                            entry.getValue().setName(updateName);
                        }
                    }
                    break;
                case 2:
                    for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                        if (entry.getKey() == enteredId) {
                            System.out.println("Your position is " + entry.getValue().getPosition());
                            scanner.nextLine();
                            System.out.println("Entered your new position: ");
                            String updatePosition = scanner.nextLine();
                            entry.getValue().setPosition(updatePosition);
                        }
                    }
                    break;


                case 3:
                    for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                        if (entry.getKey() == enteredId) {
                            System.out.println("Your salary is " + entry.getValue().getSalary());
                            scanner.nextDouble();
                            System.out.println("Entered your new salary: ");
                            double updateSalary = 0;
                            boolean validSalary = false;
                            while (!validSalary) {
                                try {
                                    updateSalary = Double.parseDouble(scanner.nextLine());
                                    entry.getValue().setSalary(updateSalary);
                                    validSalary = true;
                                } catch (NumberFormatException e) {
                                    System.out.println("Invalid input. Please enter a valid salary");
                                }
                            }

                        }
                    }
                    break;
                default:
                    System.out.println("Incorrect choice");
                    break;
            }
            System.out.print("Do you want to change anything else? (yes-1/no-2): ");
            int anotherChoice = scanner.nextInt();

            if (anotherChoice != 1) {
                System.out.println("Exit");
                break;
            }
        }
        scanner.nextLine();

        return map;

    }

    public static Map<Integer, Employee> sortMapByDifferentCriteria(Map<Integer, Employee> updateMap) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        while (true) {
            System.out.println("Select sorting: 1- sortByKey, 2- name ,3- position ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Map<Integer, Employee> sortedMap = new TreeMap<>(updateMap);
                    for (Map.Entry<Integer, Employee> entry : sortedMap.entrySet()) {
                        System.out.println("Id " + entry.getKey() + " name " + entry.getValue());
                    }
                    break;
                case 2:
                    Map<Integer, Employee> map = new HashMap<>(updateMap);
                    List<Map.Entry<Integer, Employee>> entryList = new ArrayList<>(map.entrySet());
                    Collections.sort(entryList, Comparator.comparing(new Function<Map.Entry<Integer, Employee>, String>() {
                        @Override
                        public String apply(Map.Entry<Integer, Employee> entry) {
                            return entry.getValue().getName();
                        }
                    }));

                    Map<Integer, Employee> sortedMapByName = new LinkedHashMap<>();
                    for (Map.Entry<Integer, Employee> entry : entryList) {
                        sortedMapByName.put(entry.getKey(), entry.getValue());
                    }

                    System.out.println(sortedMapByName);
                    break;
                case 3:
                    Map<Integer, Employee> map3 = new HashMap<>(updateMap);
                    List<Map.Entry<Integer, Employee>> entryList3 = new ArrayList<>(map3.entrySet());
                    try {
                        Collections.sort(entryList3, Comparator.comparing(new Function<Map.Entry<Integer, Employee>, String>() {
                            @Override
                            public String apply(Map.Entry<Integer, Employee> entry) {
                                return entry.getValue().getPosition();
                            }
                        }));
                    } catch (NullPointerException exception) {
                        System.out.println(exception.getMessage());
                    }


                    Map<Integer, Employee> sortedMapByPosition = new LinkedHashMap<>();
                    for (Map.Entry<Integer, Employee> entry : entryList3) {
                        sortedMapByPosition.put(entry.getKey(), entry.getValue());
                    }

                    System.out.println(sortedMapByPosition);
                    break;

                default:
                    System.out.println("Incorrect choice");
                    break;
            }
            System.out.print("Do you want to sort anything else? (yes-1/no-2): ");
            int anotherChoice = scanner.nextInt();

            if (anotherChoice != 1) {
                System.out.println("Exit");
                break;
            }
        }
        scanner.nextLine();

        return updateMap;
    }


}






