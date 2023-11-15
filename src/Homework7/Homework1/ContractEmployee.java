package Homework7.Homework1;

public class ContractEmployee extends Employee implements Payment {
    String federalTaxIdmember;
    double hourlyRate;
    double hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxIdmember, double hourlyRate, double hoursWorked) {
        super(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
