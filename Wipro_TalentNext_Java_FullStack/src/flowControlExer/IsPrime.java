package flowControlExer;
import java.util.Scanner;
public class IsPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input :");
		int num=sc.nextInt();
		int flag=0;
		if(num<2) {
			System.out.println("No");
			
		}
		
		for(int i=2; i<Math.sqrt(num); i++){
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}

}
