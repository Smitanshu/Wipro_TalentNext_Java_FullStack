package flowControlExer;
import java.util.Scanner;
public class LastDigitChk {

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter Fisrt Non-Negative integer :");
	 int num1=sc.nextInt();
	 
	 System.out.print("Enter Second Non-Negative integer :");
	 int num2=sc.nextInt();
	 
	 boolean result=lastDigit(num1, num2);
	 System.out.println("Do the  numbers have the same last digit? :"+ result);
	 
	 sc.close();
	 
	 
	}
	public static boolean lastDigit(int num1, int num2) {
		return (num1%10)==(num2%10);
		
	}

}
