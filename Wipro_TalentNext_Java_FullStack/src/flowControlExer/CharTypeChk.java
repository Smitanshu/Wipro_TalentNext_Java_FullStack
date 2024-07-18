package flowControlExer;
import java.util.Scanner;
public class CharTypeChk {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Aphabet or number or special char :");
		char input1=sc.next().charAt(0);
		
		if(Character.isLetter(input1)) {
			System.out.println("Alphabet");
			
		}
		else if(Character.isDigit(input1)) {
			System.out.println("Digit ");
		}
		else {
			System.out.println("Special Character");
		}
		
		sc.close();
	}

}
