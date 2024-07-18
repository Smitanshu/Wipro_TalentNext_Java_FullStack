package flowControlExer;

public class lowerUpper {
	public static void main(String[] args) {
		
		
	  char ch='A';
	  
		
		if(Character.isLowerCase(ch)) {
			char upperCaseCh=Character.toUpperCase(ch);
			
			System.out.println(ch +" -> "+ upperCaseCh);
			
		}
		else if(Character.isUpperCase(ch)){
			char lowerCaseCh=Character.toLowerCase(ch);
			System.out.println(ch+"->"+ lowerCaseCh);
			
		}
		else {
			System.out.println("Invalid input :");
			
		}
		
		   
		   
	}

}
