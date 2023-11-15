package PracticalTasks7.Practical2;

public class Main {
    public static void main(String[] args) {
        Person[] people = {new Teacher("Oksana", "Teacher"),
                new Teacher("Volodimir", "Teacher"),
                new Cleaner("Irina", "Cleaner"),
                new Cleaner("Valentina", "Cleaner"),
                new Student("Dmitro", "Student"),
                new Student("Olesya", "Student")};
            for (Person person : people){
                person.print();
            }
            for (Person person : people){
                if (person instanceof Teacher){
                    ((Teacher)person).salary();
                } else if (person instanceof Cleaner){
                    ((Cleaner)person).salary();
                }
            }
    }
}
