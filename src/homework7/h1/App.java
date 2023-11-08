package homework7.h1;

import java.util.Arrays;
import java.util.Objects;

public class App {

    public static void main(String[] args) {
        Employee[] employee = new Employee[4];
        employee[0] = new SalariedEmployee("1","Bob", 123, 23000);
        employee[1] = new ContractEmployee("2","Eva", 1234, 200, 120);
        employee[2] = new SalariedEmployee("3","Lili", 1234, 25000);
        employee[3] = new ContractEmployee("4","Taras", 987456, 190, 120);
        Arrays.sort(employee);


        for (Employee employee1:employee){
            employee1.data();
        }


    }
}