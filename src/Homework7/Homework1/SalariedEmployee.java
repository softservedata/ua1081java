package Homework7.Homework1;

public class SalariedEmployee extends Employee implements Payment{
    String socialSecurityNumber;
    double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, double fixedMonthlyPayment) {
        super(employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
