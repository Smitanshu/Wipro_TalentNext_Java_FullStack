package isEven;
import java.io.*;
import java.util.*;
public class isEven {
	
	public static int isEven(int x) {
		
		
		if(x==0) {
			return 2;
		}
		if(x%2==0) {
			return 2;
		}
		else {
			return 1;
		}
		
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method 
		int x;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		x=sc.nextInt();
		result=isEven(x);
		System.out.println(result);

		
		
		
		

	}

}
