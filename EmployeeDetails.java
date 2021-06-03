   public class EmployeeDetails {
	
	String firstName;
    String lastName;
    private String employeeDepartment;
    String paymentMode;
    private double allowance;
	double salary;
	private long accountNumber;
	private double tax;
	String employeeID;
	double netIncome;

// static double finalSalary(  double tax , double salary ,double allowance){

// 	return salary + allowance - tax;
// }

	public EmployeeDetails(String firstName, String lastname, String employeeDepartment, String paymentMode, double allowance, double salary, long accountNumber, double tax, String employeeID, double netIncome) {
		this.firstName = firstName;
		this.lastName = lastname;
		this.employeeDepartment = employeeDepartment;
		this.paymentMode = paymentMode;
		this.allowance = allowance;
		this.salary = salary;
		this.accountNumber = accountNumber;
		this.tax = tax;
		this.employeeID	= employeeID;
		this.netIncome = netIncome;
	}

	public EmployeeDetails() {

	}

	public double getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(double netIncome) {
		this.netIncome = netIncome;
	}

	public double calculateSalary() {
		double netIncome = (this.allowance + this.salary) - this.tax;
		return netIncome;
	}

	//Getter and Setter methods 
	
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

    public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

    public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

    public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

    public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}


	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	@Override
	public String toString() {
	  return "\n" +" <--Full Time Employee--> " + "\n" + "Employee Name: " + firstName + " " + lastName  +"\n"+ "Department: " + employeeDepartment  + "\n" + 
	  "Payment Mode:" + paymentMode  + "\n" + "Employee Allowance: " + allowance  + "\n" + "Salary (GHS): " + salary  + "\n" + 
	  "Tax (GHS): " + tax  + "\n" + "Employee ID: " + employeeID + "\n" + "Net Income: " + calculateSalary();
	}
}
 
