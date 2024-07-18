package flowControlExer;
import java.util.Scanner;
public class AlphaOrder {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first char :");
		char first=sc.next().charAt(0);
		
		System.out.print("Enter second char :");
		char second=sc.next().charAt(0);
		
		
		if(first<second)
		{
			System.out.println(first+","+ second);
	
		}
		else {
			System.out.println(second+","+ first);
		}
		
		sc.close();

	}

}
