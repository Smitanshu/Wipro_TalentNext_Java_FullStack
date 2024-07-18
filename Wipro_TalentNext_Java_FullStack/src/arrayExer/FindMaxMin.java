package arrayExer;

public class FindMaxMin {

	public static void main(String[] args) {
		
		int []myArray=new int[] {9,39,76,5,13,75,12,64,3,554,23,1,64247,34,632,0,642479};
		int min=myArray[0];
		int max=myArray[0];
		
		for(int i=0; i<myArray.length;i++) {
			if(min>myArray[i]) {
				min=myArray[i];
			}
			if(max<myArray[i]) {
				max=myArray[i];
			}
			
		}
		
		System.out.println("Min :"+min);
		System.out.println("Max :"+max);
		

	}

}
