package flowControlExer;
import java.util.Scanner;
public class PrintFloydsFormat {
	public static void main(String[] args) {
		System.out.println("Please enter number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int j=1;
		while(j<=num) {
			for(int i=1; i<=j;i++) {
				System.out.print("* ");
			}
			System.out.println();
		    j++;
		}
		sc.close();
	}
	
}