public class PartTime extends EmployeeDetails {
    public PartTime(String firstName, String lastname, String employeeDepartment, String paymentMode, double allowance, double salary, long accountNumber, double tax, String employeeID, double netIncome) {
        super(firstName, lastname, employeeDepartment, paymentMode, allowance, salary, accountNumber, tax, employeeID, netIncome);
    }

    public PartTime() {

    }

    public int numOfWorkingDays;

    @Override
    public String toString() {
    return "\n"+"<--Part Time Employee--> " +"\n"+ "Employee Name: " + firstName + " " + lastName  +"\n" +
    "Payment Mode:" + paymentMode  + "\n" + "Salary (GHS): " + salary  + "\n" + 
    "Number of working Days: " + numOfWorkingDays  + "\n" + "Employee ID: " + employeeID;
    }
    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }
    public void setNumOfWorkingDays(int numOfWorkingDays)
    {
        this.numOfWorkingDays = numOfWorkingDays;
    }   
}
