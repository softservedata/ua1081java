package PracticalTasks8;

public class DepartmentMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Department1", "Lviv", "Shevchenka", 125);
        System.out.println("Department1: " + department.getAddress());
        Department department1 = (Department) department.clone();
        department1.getAddress().setCity("Kyiv");
        System.out.println("Department2: " + department1.getAddress());

    }
}
