package collection;
public class EmployeeMainClass {
	public static void main(String[] args) {
		EmployeeDB empDB=new EmployeeDB();
		Employee emp1=new  Employee(101, "Himanshu",  "him@123gmail.com", "M", 10000);
		Employee emp2=new  Employee(102, "Smitanshu",  "smit@123gmail.com", "M", 2000);
			
		Employee emp3=new  Employee(103, "Piyush",  "piyush@123gmail.com", "M", 3000);
		
		empDB.addEmployee(emp1);
		empDB.addEmployee(emp2);
		empDB.addEmployee(emp3);
		
		
		System.out.println("Employee Details :");
		emp1.getEmployeeDetails();
		emp2.getEmployeeDetails();
		emp3.getEmployeeDetails();
		
		
		System.out.println("\nPaySlip for Employee ID 101 :");
		System.out.println(empDB.showPaySlip(101));
		System.out.println("Deleting Employee of ID 101 :");
	    empDB.deleteEmployee(101);

	    
	    
	    System.out.println("\nPaySlip for Employee ID 101 after deletion :");
	    System.out.println(empDB.showPaySlip(101));
		
		
		
		
		
		

	}

}
