package practical8;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Department department1= new Department("Bob","Seville","Regina",2);
        Department department2= (Department) department1.clone();
        department1.getAddress().setCity("Lviv");
        System.out.println(department1);
        System.out.println(department2);


    }
}