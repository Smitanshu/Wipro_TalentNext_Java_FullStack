package cmdthirdHandsOn;

public class Sum {
	public static void main(String[] args) {
	
	if(args.length==2) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int sum=num1+num2;
		System.out.println("The sum of " + num1 +" and "+ num2 + " is " +sum  );
		
	}else {
		System.out.println("Enter only two integer :");
	}
		
		
		
	}

}
