package miniProjectEmployeeInformationInputAndDisplay;

import java.util.Scanner;

class Employee {
	int empNo;
	String empName;
	String joinDate;
	char designationCode;
	String department;
	int basic;
	int hra;
	int it;

	Employee(int empNo, String empName, String joinDate, char designationCode, String department, int basic, int hra,
			int it) {
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.designationCode = designationCode;
		this.department = department;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
}

public class EmployeeDetails {
	// Initialize the employee array
	static Employee[] employees = {
			new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
			new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
			new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
			new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
			new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 9000),
			new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),
			new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 9000) };

	// Designation and DA details
	static String[] designations = { "Engineer", "Consultant", "Clerk", "Receptionist", "Manager" };
	static int[] da = { 20000, 32000, 12000, 15000, 40000 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee ID: ");
		int empId = scanner.nextInt();

		// Find and display employee details
		Employee emp = findEmployeeById(empId);
		if (emp != null) {
			displayEmployeeDetails(emp);
		} else {
			System.out.println("Employee not found.");
		}

		scanner.close();
	}

	public static Employee findEmployeeById(int empId) {
		for (Employee emp : employees) {
			if (emp.empNo == empId) {
				return emp;
			}
		}
		return null;
	}

	public static void displayEmployeeDetails(Employee emp) {
		String designation = getDesignation(emp.designationCode);
		int daValue = getDA(emp.designationCode);

		System.out.println("Emp No: " + emp.empNo);
		System.out.println("Emp Name: " + emp.empName);
		System.out.println("Department: " + emp.department);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + calculateSalary(emp.basic, emp.hra, daValue, emp.it));
	}

	public static String getDesignation(char designationCode) {
		switch (designationCode) {
		case 'e':
			return designations[0];
		case 'c':
			return designations[1];
		case 'k':
			return designations[2];
		case 'r':
			return designations[3];
		case 'm':
			return designations[4];
		default:
			return "Unknown";
		}
	}

	public static int getDA(char designationCode) {
		switch (designationCode) {
		case 'e':
			return da[0];
		case 'c':
			return da[1];
		case 'k':
			return da[2];
		case 'r':
			return da[3];
		case 'm':
			return da[4];
		default:
			return 0;
		}
	}

	public static int calculateSalary(int basic, int hra, int da, int it) {
		return basic + hra + da - it;
	}
}
