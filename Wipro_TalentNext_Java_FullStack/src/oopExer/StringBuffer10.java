package oopExer;
public class StringBuffer10 {
	public static String repetitions(String str, int len) {
		StringBuffer result=new StringBuffer();
		for(int i=0; i<len;i++) {
			
			result.append(str.subSequence(str.length()-len, str.length()));
			
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(repetitions("Wipro", 3));
	
	}

}
