package homework3.h3;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static void input(Person person) {
        System.out.println("Input first name:");
        String firstName = Main.SCANNER.nextLine();
        person.setFirstName(firstName);
        System.out.println("Input last name for " + person.getFirstName());
        String lastName = Main.SCANNER.nextLine();
        person.setLastName(lastName);
        System.out.println("Input birthday year for " + person.getFirstName() + " " + person.getLastName());
        int birthYear = Main.SCANNER.nextInt();
        Main.SCANNER.nextLine();
        person.setBirthYear(birthYear);
    }


    public int getAge() {
        return (int) 2023 - birthYear;

    }

    public static void output(Person person) {
        System.out.println(" Person info ");
        System.out.println("Name: " + person.getFirstName()+ "\t Last name: "
                + person.getLastName() + "\n Birth year: " + person.getBirthYear() + "\t Age person: " + person.getAge());
    }
@Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
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
    public void changeName(String firstName, String lastName) {
        if (firstName != null) {
            setFirstName(firstName);
        }
        if (lastName != null) {
            setLastName(lastName);
        }
    }
}
