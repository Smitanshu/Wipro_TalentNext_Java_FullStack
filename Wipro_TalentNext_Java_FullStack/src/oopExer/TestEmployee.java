package oopExer;
public class TestEmployee {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Smitanshu Ukey", 532000, 2024, "RBT21IT108");

     
        
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

       
        
        
        employee.setName("Samrat Gaisamudre");
        employee.setAnnualSalary(55000);
        employee.setYearStarted(2024);
        employee.setNationalInsuranceNumber("RBT21IT127");

      
        System.out.println(employee);
    }
}