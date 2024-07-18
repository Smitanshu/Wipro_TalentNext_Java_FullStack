package flowControlExer;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the nummber :");
		int num1=sc.nextInt();
		if(num1%2==0) {
			
			System.out.println(num1 +" is even.");
			
		}
		else if(num1==0) {
		System.out.println(num1 +" is even.");
		}
		else {
			System.out.println(num1+" is odd.");
			
		}
		sc.close();

	}

}
