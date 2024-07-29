package collection;
public class Employee {
	private int empID;
	private String empName;
	private String email;
	private String gender;
	private float salary;

	public Employee(int empID, String empName, String email, String gender, float salary) {
		this.empID = empID;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;

	}

	public int getEmpID() {

		return empID;

	}

	public String getName() {
		return empName;
	}

	public String getEmail() {
		return email;

	}

	public String getGender() {
		return gender;
	}

	public float getSalary() {
		return salary;
	}

	public void getEmployeeDetails() {
	
		System.out.println("empId:" + empID);
		System.out.println("Employee Name:" + empName);
		System.out.println("Email :" + email);
		System.out.println("Gender :" + gender);
		System.out.println("Salary:" + salary);
		System.out.println();

	}

}
