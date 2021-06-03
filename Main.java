import java.util.Scanner;
import java.util.ArrayList;
 


public class Main {
    public static void main(String[] args) 
	{ 

	ArrayList <EmployeeDetails> fullTime = new ArrayList<>();
	EmployeeDetails employee1=new EmployeeDetails();
	EmployeeDetails employee0=new EmployeeDetails();

    employee0.setFirstName("Richard");
    employee0.setLastName("Okofo");
    employee0.setEmployeeDepartment("Engineering");
    employee0.setPaymentMode("Direct Deposit");
    employee0.setAllowance(500.00);
    employee0.setSalary(10000.00);
    employee0.setTax(100.00);
    employee0.calculateSalary();
    employee0.setEmployeeID("HR232");

    employee1.setFirstName("John");
    employee1.setLastName("Owusu");
    employee1.setEmployeeDepartment("HR");
    employee1.setPaymentMode("Direct Deposit");
    employee1.setAllowance(20.00);
    employee1.setSalary(9000.00);
    employee1.setTax(20.00);
    employee1.setEmployeeID("HR233");
    
    ArrayList <PartTime> partTime = new ArrayList<PartTime>();
    PartTime employee2=new PartTime();
    PartTime employee=new PartTime();
    
    employee2.setFirstName("Mike");
    employee2.setLastName("Tyson");
    employee2.setPaymentMode("Direct Deposit");
    employee2.setSalary(100.00);
    employee2.setEmployeeID("442gh");
    employee2.setNumOfWorkingDays(3);
    employee2.setEmployeeID("HR231");

    employee.setFirstName("Akwesi");
    employee.setLastName("Thompson");
    employee.setPaymentMode("Cash");
    employee.setSalary(900.00);
    employee.setEmployeeID("442gh");
    employee.setNumOfWorkingDays(3);
    employee.setEmployeeID("HR230");

    partTime.add(employee2);
    partTime.add(employee);
    fullTime.add(employee1);
    fullTime.add(employee0);
    
             
			     
     Scanner scanner = new Scanner(System.in);


    System.out.println("ENTER 1 TO DISPLAY DATA");
    System.out.println("ENTER 2 TO ADD FULL TIME EMPLOYEE");
	System.out.println("ENTER 3 TO ADD PART TIME EMPLOYEE");
	System.out.println("ENTER 4 TO DELETE FULL TIME EMPLOYEE");
	System.out.println("ENTER 5 TO DELETE PART TIME EMPLOYEE");
	// System.out.println("ENTER 6 TO UPDATE FULL TIME EMPLOYEE");
	// System.out.println("ENTER 7 TO DELETE PART TIME EMPLOYEE");

	  int  userInput  = scanner.nextInt();
            
			 if (userInput == 1){
				 System.out.println(fullTime);
				 System.out.println(partTime);
			 } 
			 else if (userInput == 2)
			 {

           EmployeeDetails employee3=new EmployeeDetails();
         Scanner scan = new Scanner(System.in);

           System.out.println("Employee first name: ");
            String  Fname  = scan.nextLine();
			employee3.setFirstName(Fname);

            System.out.println("Employee last name: ");
            String  Lname  = scan.nextLine();
			employee3.setLastName(Lname);

			 System.out.println("Employee department: ");
             String  dPart  = scan.nextLine();
			 employee3.setEmployeeDepartment(dPart);

			 System.out.println("Payment Mode: ");
             String  pMode  = scan.nextLine();
			 employee3.setPaymentMode(pMode);

			  System.out.println("Employee allowance: ");
             double  allowa  = scan.nextDouble();
			 employee3.setAllowance(allowa);

			  System.out.println("Employee salary: ");
             double  salary  = scan.nextDouble();
			 employee3.setSalary(salary);

			 System.out.println("Employee tax: ");
            int  eTax  = scan.nextInt();
			employee3.setTax(eTax); 

			employee3.setEmployeeID("HR234");
             
			 fullTime.add(employee3);
			  System.out.println(fullTime.get(2));


			 }
			 else if (userInput ==3)
			 {
				 
            PartTime employee4=new PartTime();
         Scanner scan = new Scanner(System.in);

           System.out.println("Employee first name: ");
            String  Fname  = scan.nextLine();
			employee4.setFirstName(Fname);

            System.out.println("Employee last name: ");
            String  Lname  = scan.nextLine();
			employee4.setLastName(Lname);

			 System.out.println("Payment Mode: ");
             String  pMode  = scan.nextLine();
			 employee4.setPaymentMode(pMode);

			  System.out.println("Employee salary: ");
             double  salary  = scan.nextDouble();
			 employee4.setSalary(salary);

			 System.out.println("Number of working days: ");
            int  numOfWorkingDays  = scan.nextInt();
			employee4.setNumOfWorkingDays(numOfWorkingDays); 

			employee4.setEmployeeID("HR235");
             
			  partTime.add(employee4);
			  System.out.println(partTime.get(1));


			 }
			 else if (userInput ==4)
			 {
               System.out.println("choose employee to be deleted");
			  System.out.println(fullTime);
			   System.out.println("enter 1 for first employee");
			   System.out.println("enter 2 for second employee");
			   int  userInput1  = scanner.nextInt();
			   if (userInput1 == 1)
			   {
                fullTime.remove(0);
				System.out.println(fullTime);
			   } else
			   {
				  fullTime.remove(1);
				System.out.println(fullTime); 
			   }
			 }
			  else if (userInput ==5)
			 {
               System.out.println("choose employee to be deleted");
			  System.out.println(partTime);
			   System.out.println("enter 1 for first employee");
			   System.out.println("enter 2 for second employee");
			   int  userInput1  = scanner.nextInt();
			   if (userInput1 == 1)
			   {
                partTime.remove(0);
				System.out.println(partTime);
			   } else
			   {
				  partTime.remove(1);
				System.out.println(partTime); 
			   }
			 }
			 else 
			 {
              System.out.println("INPUT NOT FOUND");
			 }

			
           
	} 
}
