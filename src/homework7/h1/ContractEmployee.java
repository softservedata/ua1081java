package homework7.h1;

import jdk.jshell.EvalException;
import java.util.Comparator;
import java.util.Objects;

public class ContractEmployee extends Employee implements Payment {
    private String name;
    private int federalTaxIdmember;
    private int hourlyRate;
    private int hours;


    public ContractEmployee(String employeeld, String name, int federalTaxIdmember, int hourlyRate, int hours) {
        super(employeeld);
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", hourlyRate=" + hourlyRate +
                ", hours=" + hours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractEmployee that = (ContractEmployee) o;
        return federalTaxIdmember == that.federalTaxIdmember && hourlyRate == that.hourlyRate && hours == that.hours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(federalTaxIdmember, hourlyRate, hours);
    }

    @Override
    public int calculatePay() {
        return hourlyRate * hours;
    }

    public void data() {
        System.out.println("Name" + getName() + " ID " + getFederalTaxIdmember() + " salary " + calculatePay());
    }
}