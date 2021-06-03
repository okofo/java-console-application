public class FullTime extends EmployeeDetails {
    private double rate;
    private double hoursWorked;

    public FullTime(String firstName, String lastname, String employeeDepartment, String paymentMode, double allowance, double salary, long accountNumber, double tax, String employeeID, double rate, double hoursWorked, double netIncome) {
        super(firstName, lastname, employeeDepartment, paymentMode, allowance, salary, accountNumber, tax, employeeID, netIncome);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}