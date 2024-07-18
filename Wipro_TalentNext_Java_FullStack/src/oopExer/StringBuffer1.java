package oopExer;
public class StringBuffer1 {
	public static void main(String[] args) {
  String str1="nayaan";
  str1=str1.toLowerCase();
  int start=0;
  int end=str1.length()-1;
  while(start<end) {
	  if(str1.charAt(start)!=(str1.charAt(end))) {
		  System.out.println("No");
		  return;  
	  }
	 start++;
	 end--;
  }
  System.out.println("Yes");
		
	}

}
