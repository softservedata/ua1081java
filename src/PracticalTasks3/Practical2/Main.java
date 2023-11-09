package PracticalTasks3.Practical2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 23, 180);
//        emp1.setName("Alice");
//        emp1.setRate(23);
//        emp1.setHours(180);
        Employee emp2 = new Employee("Bob", 25, 186);
        Employee emp3 = new Employee("Jhon", 30, 150);

        System.out.println(emp1 + "\n" + emp2 + "\n" + emp3);

        double emp1Total = emp1.getSalery() + emp1.getBonus();
        double emp2Total = emp2.getSalery() + emp2.getBonus();
        double emp3Total = emp3.getSalery() + emp3.getBonus();

        Employee.setTotalSum(emp1Total+emp2Total+emp3Total);

        System.out.println("Total Salary of all employees including bonus(10%) is: " + Employee.getTotalSum());




    }
}
