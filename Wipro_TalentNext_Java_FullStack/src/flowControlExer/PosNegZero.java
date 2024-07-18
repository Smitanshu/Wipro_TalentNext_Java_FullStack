package flowControlExer;
public class PosNegZero {
	public static void main(String args[]) {
		if(args.length==1) {
			int input1=Integer.parseInt(args[0]);
			if(input1==0) 
			{
				System.out.println("Integer Number is Zero :"+ input1);
				
			}
			else if(input1>0) {
				System.out.println("Integer number is positive :"+ input1);
			}
			else {
				System.out.println("Integer number is Negative :"+input1);
				
			}
		}else {
			System.out.println("Enter the correct input :");
			
		}
		
	}

}
