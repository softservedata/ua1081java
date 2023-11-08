package homework7.h1;

import java.util.Objects;
import java.util.Comparator;

public class SalariedEmployee extends Employee implements Payment {
    private String name;
    private int socialSecurityNumber;
    private int payment;

    public SalariedEmployee(String employeeld, String name, int socialSecurityNumber, int payment) {
        super(employeeld);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.payment = payment;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", payment=" + payment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return socialSecurityNumber == that.socialSecurityNumber && payment == that.payment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber, payment);
    }

    public String getName() {
        return name;
    }

    public int getPayment() {
        return payment;
    }

    @Override
    public int calculatePay() {
        return payment;
    }
    public void data(){
        System.out.println("Name " + getName() + " ID " + getSocialSecurityNumber()+ " salary " + calculatePay());
    }
}
