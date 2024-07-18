package mcq;
public class mcq4 {
	public static void main(String[] args) {
	
		String str1="Smitanshu";
		String str2="Smitanshu";
		
		if(str1==str2) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not");
		}
		
		String str3=new String("Smitanshu");
		String str4=new String("Smitanshu");
		if(str3==str4) {
			System.out.println("equal2");
		}
		else {
			System.out.println("not2");
		}
		

		//It gives equal1 and not2 why ;
		
		
	}

}
