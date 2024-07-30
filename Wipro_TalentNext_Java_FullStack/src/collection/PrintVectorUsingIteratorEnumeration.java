package collection;
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

//Using the Employee class which is already present in the Collection

public class PrintVectorUsingIteratorEnumeration {

	public static void printUsingIterator(Vector<Employee> Emp) {
		System.out.println("Printing Details Using Iterator : ");
		Iterator<Employee> iterator = Emp.iterator();
		while (iterator.hasNext()) {
			Employee obj1 = iterator.next();
			obj1.getEmployeeDetails();
			System.out.println();

		}
	}

	public static void printUsingEnumeration(Vector<Employee> Emp) {
		System.out.println("Printing Details Using Enumeration  : ");
		Enumeration<Employee> en = Emp.elements();

//getEmployeeDetails() Defined in the Package Collection--->Employee.java
		while (en.hasMoreElements()) {
			Employee emp = en.nextElement();
			emp.getEmployeeDetails(); //Defined in the Package Collection--->Employee.java
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Vector<Employee> emp = new Vector<Employee>();

		emp.add(new Employee(103, "abc", "abc@123gmail.com", "M", 10000));
		emp.add(new Employee(104, "def", "def@123gmail.com", "M", 60000));

		printUsingIterator(emp);

		printUsingEnumeration(emp);

	}

}
