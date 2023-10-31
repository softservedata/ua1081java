package Homework_02_Ivan.Practical_02;

public class Employee {

    private String name;
    private double rate;
    private double hours;

    static double totalSum;

    public static void printEmployeeSalary() {
        System.out.println("Total salary = " + Employee.getTotalSum() );
    }

    public Employee() {
        this ("n/a", 0, 0);
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        // calculate and update the totalSum when a new Employee is created
        totalSum += getSalary() + getBonuses();
    }

     public double getSalary () {
        return rate * hours;
        }

     public double getBonuses () {
        double bonuses = getSalary() * 0.1;
        totalSum += bonuses;
        return bonuses;
    }


    public static void promptParameters(Employee employee) {
        System.out.println("Input name:");
        String name = MainEmployee.SCANNER.nextLine();
        MainEmployee.SCANNER.nextLine();
        employee.setName(name);

        System.out.println("Input rate for employee '" + employee.getName() + "':");
        double rate = MainEmployee.SCANNER.nextDouble();
        MainEmployee.SCANNER.nextLine();
        employee.setRate(rate);

        System.out.println("Input hours for employee '" + employee.getName() + "':");
        double hours = MainEmployee.SCANNER.nextDouble();
        MainEmployee.SCANNER.nextLine();
        employee.setHours(hours);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }



    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {

        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
