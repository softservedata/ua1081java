package com.softserve.edu.lesson_9_MapSet.practice.prctice_2;

import java.util.*;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private String birthday;

    public static class byId implements Comparator<Map.Entry<Integer, Employee>> {

        @Override
        public int compare(Map.Entry<Integer, Employee> st1, Map.Entry<Integer, Employee> st2) {
            return st1.getKey() - st2.getKey();
        }
    }

    public static class byName implements Comparator<Map.Entry<Integer, Employee>> {
        @Override
        public int compare(Map.Entry<Integer, Employee> st1, Map.Entry<Integer, Employee> st2) {
            int name = st1.getValue().getName().compareTo(st2.getValue().getName());
            if (name == 0) {
                return st1.getKey() - st2.getKey();
            }
            return name;
        }
    }

    public static class byPosition implements Comparator<Map.Entry<Integer, Employee>> {
        @Override
        public int compare(Map.Entry<Integer, Employee> st1, Map.Entry<Integer, Employee> st2) {
            int pos = st1.getValue().getPosition().compareTo(st2.getValue().getPosition());
            if (pos == 0) {
                int name = st1.getValue().getName().compareTo(st2.getValue().getName());
                return name;
            }
            return pos;
        }
    }

    public Employee(String name, String position, double salary, String birthday) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    static void display(Map<Integer, Employee> map) {
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println("ID " + entry.getKey() + ": " + entry.getValue());
        }
    }

    static void addEmployee(Scanner sc, Map<Integer, Employee> map) {
        System.out.println("Please enter ID");
        int id = sc.nextInt();
        System.out.println("Please enter name");
        String name = sc.next();
        System.out.println("Please enter position");
        String position = sc.next();
        System.out.println("Please enter salary");
        double salary = sc.nextDouble();
        System.out.println("Please enter birthday (D-M-Y)");
        String birthday = sc.next();
        if (!isDuplicate(map, id, name)) {
            map.put(id, new Employee(name, position, salary, birthday));
            System.out.println("Employee added");
        } else {
            System.out.println("Error!! Found duplicate");
        }
        display(map);

    }

    private static boolean isDuplicate(Map<Integer, Employee> map, int id, String name) {
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            if (entry.getKey() == id || entry.getValue().getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    static void changeEmployee(Scanner sc, Map<Integer, Employee> map) {
        System.out.println("Please enter the ID of the employee you want to change");
        int id = sc.nextInt();
        if (map.containsKey(id)) {
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter position");
            String position = sc.next();
            System.out.println("Enter salary");
            double salary = sc.nextDouble();
            System.out.println("Please enter birthday (D-M-Y)");
            String birthday = sc.next();
            map.replace(id, new Employee(name, position, salary, birthday));

        } else {
            System.out.println("We cant find the employee with such ID");
        }
        display(map);
    }

    static void sortEmployee(Scanner sc, Map<Integer, Employee> map) {
        System.out.println("Please choice how you can sort employee");
        System.out.println("1.By ID");
        System.out.println("2.By name");
        System.out.println("3.By position");
        int sort = sc.nextInt();
        List<Map.Entry<Integer, Employee>> sortList = new ArrayList<>(map.entrySet());
        sc.nextLine();
        switch (sort) {
            case 1:
                sortList.sort(new Employee.byId());
                for (Map.Entry<Integer, Employee> entry : sortList) {
                    System.out.println("ID " + entry.getKey() + " :" + entry.getValue());
                }
                break;
            case 2:
                sortList.sort(new Employee.byName());
                for (Map.Entry<Integer, Employee> entry : sortList) {
                    System.out.println("ID " + entry.getKey() + " :" + entry.getValue());
                }
                break;
            case 3:
                sortList.sort(new Employee.byPosition());
                for (Map.Entry<Integer, Employee> entry : sortList) {
                    System.out.println("ID " + entry.getKey() + " :" + entry.getValue());
                }
                break;
            default:
                System.out.println("Invalid sort criterion. Please enter a valid option.");

        }

    }
}

