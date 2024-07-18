package flowControlExer;
import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  Number :");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		while(temp>0) {
			int bit=temp%10;
			sum+=bit;
			temp=temp/10;
			
		}
		System.out.println("Sum  :"+sum);
		
		sc.close();
	}

}
