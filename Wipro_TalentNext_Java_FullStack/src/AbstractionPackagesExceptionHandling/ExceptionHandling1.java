package AbstractionPackagesExceptionHandling;
import java.util.Scanner;
import java.util.*;
public class ExceptionHandling1 {
	public static void main(String[] args) {
		
		try {
			
			
			System.out.println("Enter the number of Elements");
			Scanner sc=new Scanner(System.in);
			int len=sc.nextInt();
			int arr[]=new int[len];
			System.out.println("Enter the elements in array");
			for(int i=0; i<len;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the index of array you want to access");
			int index=sc.nextInt();
			
			System.out.println("The array element at index "+index +"="+ arr[index]);
			System.out.println("The array element succesfully accessed");
			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			
		}
		catch(NumberFormatException ne) {
			System.out.println(ne);
		}
		
		
		
	}

}
