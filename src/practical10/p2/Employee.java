package practical10.p2;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
private Integer id;
private String name;
private String position;
private Double salary;
private Integer dayBirthday;

    public static class ByName implements Comparator<Employee> {
        @Override
        public int compare(Employee st1, Employee st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class ById implements Comparator<Employee> {
        @Override
        public int compare(Employee st1, Employee st2) {
            return st1.getId() - st2.getId();
        }
    }

    public static class ByPosition implements Comparator<Employee> {
        @Override
        public int compare(Employee st1, Employee st2) {
            return st1.getPosition().compareTo(st2.getPosition());
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDayBirthday() {
        return dayBirthday;
    }

    public void setDayBirthday(Integer dayBirthday) {
        this.dayBirthday = dayBirthday;
    }
    public Employee() {
        this.id = 0;
        this.name = "";
        this.position = "";
        this.salary = 0.0;
        this.dayBirthday = 0;
    }

    public Employee(Integer id, String name, String position, Double salary, Integer dayBirthday) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dayBirthday = dayBirthday;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(salary, employee.salary) && Objects.equals(dayBirthday, employee.dayBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position, salary, dayBirthday);
    }

    @Override
    public String toString() {
        return "Employee\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dayBirthday=" + dayBirthday +
                '}';
    }

    @Override
    public int compareTo(Employee o1) {
        return getName().compareTo(o1.getName());
        //getPosition().compareTo(o1.getPosition());
        //getId().compareTo(o1.getId());




    }
}
