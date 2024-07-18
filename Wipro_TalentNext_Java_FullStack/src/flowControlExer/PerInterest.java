package flowControlExer;
public class PerInterest {
	public static void main(String[] args) {
	   String gender=args[0];
	   String ageStr=args[1];
	   int age=Integer.parseInt(ageStr);
	   if(gender.equals("Female"))
	   {
		  if(age>=1 && age<=58) {
			  System.out.println("The percentage of Interest is 8.2%.");
		     }
		  else if(age>=59 && age<=100){
			  System.out.println("The percentage of Interest is 9.2%.");   
	         }  
	   }
	   if(gender.equals("Male"))
	   {
		  if(age>=1 && age<=58) {
			  System.out.println("The percentage of Interest is 8.4%.");
			  
		     }
		  else if(age>=59 && age<=100){
			  System.out.println("The percentage of Interest is 10.5%.");   
	         }
		  
	   }
	  
	}
}
