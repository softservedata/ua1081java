package Homework_02_Ivan.Homework;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this ("n/a", "n/a");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static void input(Person person){
        System.out.println("Input name of the person:");
        String firstName = Main_Person.SCANNER.nextLine();
        person.setFirstName(firstName);

        System.out.println("Input last name of the person '" + person.getFirstName() + "':");
        String lastName = Main_Person.SCANNER.nextLine();
        person.setLastName(lastName);

        System.out.println("Input date of birth of the person '" + person.getFirstName() + "':");
        int birthYear = Main_Person.SCANNER.nextInt();
        Main_Person.SCANNER.nextLine(); // Consume the newline character
        person.setBirthYear(birthYear);

    }

    public static void output(Person person){
        System.out.println("Hello ' " + person.getFirstName() + " " + person.getLastName() + " , " + person.getAge() + " y.o.' !");
    }

    // method to change name
    public boolean changeName(String fn, String ln) {
        boolean changesMade = false;

        if (fn != null && !fn.isEmpty()) {
            this.firstName = fn;
            changesMade = true;
        }

        if (ln != null && !ln.isEmpty()) {
            this.lastName = ln;
            changesMade = true;
        }

        return changesMade;
    }

    public int getAge (){
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}
