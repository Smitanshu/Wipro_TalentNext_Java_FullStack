package flowControlExer;
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int reverse=0;
		while(num!=0) {
			int bit=num%10;
			reverse=reverse*10+bit;
			num=num/10;
			
		}
		sc.close();
		System.out.println("Reverse Number :"+ reverse);
		
		

	}

}
