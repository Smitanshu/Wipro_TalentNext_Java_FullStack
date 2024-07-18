package flowControlExer;
public class Palindrome {
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		if(isPalli(num1)) {
			System.out.print(num1+" is pallndrome");
			
		}
		else {
			System.out.print(num1 +" is not a pallndrome");
			
		}
		
	}
		
		public static boolean isPalli(int input1) {
			int original=input1;
			int reverse=0;
			while(input1!=0) {
				int bit=input1%10;
				reverse=reverse*10+ bit;
				input1=input1/10;
			}
			
			return original==reverse;
	    
	}

}
