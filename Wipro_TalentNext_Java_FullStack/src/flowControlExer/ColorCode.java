package flowControlExer;
import java.util.Scanner;
public class ColorCode {
	public static void main(String[] args) {
		
		
		System.out.print("Enter the Alphabet in Uppercase :");
		Scanner sc=new Scanner(System.in);
		String  code=sc.nextLine();
		if(code.length()!=1) {
			System.out.println("Invalid Input");
			return;
			
		}
		char colorCode=code.charAt(0);
		String ColorName;
		switch(colorCode) {
		case 'R':
			ColorName="Red";
			break;
		case 'G':
			ColorName="Green";
			break;
		case 'B':
			ColorName="Blue";
			break;
		case 'o':
			ColorName="Orange";
			break;
		case 'Y':
			ColorName="Yellow";
			break;
		case 'W':
			ColorName="White";
			break;
		default:
			ColorName="Invalid code";
			break;
		}
		
		System.out.println(colorCode+"-> " +ColorName);
		sc.close();
		
		
		
		
	}

}
