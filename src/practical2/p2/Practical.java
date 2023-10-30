package practical2.p2;

public class Practical {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee.getInfo(employee1);

        Employee employee2 = new Employee();
        Employee.getInfo(employee2);

        Employee employee3 = new Employee();
        Employee.getInfo(employee3);

        System.out.println("Total salary is: " + Employee.totalSum());





    }
}