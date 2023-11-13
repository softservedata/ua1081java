package homework8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Bob", "Lol"), 22, 1);
        Student student2 = new Student(new FullName("Eva", "Lil"), 23, 2);
        System.out.println("\n Student 1:\n " + student1.info() + "\n Activity: " + student1.activity());
        System.out.println("\n Student 2:\n " + student2.info() + "\n Activiti: " + student2.activity());
        Student student3 = (Student) student1.clone();
        student3.setCourse(3);

        System.out.println("\n Student 3:\n " + student3.info() + "\n Activity: " + student3.activity());


    }
}