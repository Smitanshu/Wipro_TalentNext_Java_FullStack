package arrayExer;
public class PrintArray {
	public static void main(String[] args) {
		int sum=0;
		int []myArray=new int[]{11,22,33,44, 55};
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i] + " ");
			sum+=myArray[i];
		}
		int average=sum/myArray.length;
		System.out.println("\nsum :"+sum);
		System.out.println("Average :"+ average);
		
		

	}

}
