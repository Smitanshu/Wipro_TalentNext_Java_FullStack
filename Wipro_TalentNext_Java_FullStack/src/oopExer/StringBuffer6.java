package oopExer;
public class StringBuffer6 {
	
	
	public static String InsideOutside(String str1, String str2) {
		
		StringBuffer result=new StringBuffer();
		result=result.append(str1);
		result=result.append(str2);
		result=result.append(str1);
		
	return	result.toString();
	}
	public static void main(String[] args) {
		
		
		String str1="hi";
		String str2="hello";
		System.out.println(InsideOutside(str1, str2));
		System.out.println(InsideOutside("smitanshu", "ukey"));
		
		
	

	}

}
