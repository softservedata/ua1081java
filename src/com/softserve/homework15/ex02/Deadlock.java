package com.softserve.homework15.ex02;

public class Deadlock {
    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void work(Employee employee) {
            System.out.println("Started working");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            employee.backFromWork(this);
        }

        public synchronized void backFromWork(Employee employee) {
            System.out.println("Finished working");
            employee.work(this);
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex");
        Employee employee2 = new Employee("Ivan");

        new Thread(() -> employee1.work(employee2)).start();
        new Thread(() -> employee2.work(employee1)).start();
    }
}
