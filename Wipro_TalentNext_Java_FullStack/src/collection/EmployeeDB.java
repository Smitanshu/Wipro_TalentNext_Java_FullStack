package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDB {
	
	 private ArrayList<Employee> list;
	 
	 public EmployeeDB() {
		 list=new ArrayList<Employee>();
		 
		 
	 }
	 
	 
	public  boolean addEmployee(Employee e) {
		return list.add(e);
		
	 }
	 
	public  boolean deleteEmployee(int empID) {
		 Iterator<Employee> it=list.iterator();
		 Employee e=it.next();
		 while(it.hasNext()) {
			 if(e.getEmpID()==empID) {
				 it.remove();
				 return true;
			 }
			 
		 }
		return false; 
	 }
	 
	 public String showPaySlip(int empID) {
		 
		 for(Employee e:list) {
			 if(e.getEmpID()==empID) {
				 return "PaySlip for employee :";
			 }
			 System.out.println();
		 }
		 return "Employee Not Found";
		 
	 }
	

}
