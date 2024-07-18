package arrayExer;
public class BiggestElement {
	public static void printArray(int[][] nums) {
	for(int i=0; i<nums.length;i++) {
		for(int j=0; j<nums.length;j++) {
			
			System.out.print(nums[i][j] +" ");
			
		}
		System.out.println();
	     }
	}
	
	public static void main(String[] args) {
		int[][]array=new int[3][3];
		if(args.length==9) {
			
			array[0][0]=Integer.parseInt(args[0]);
			array[0][1]=Integer.parseInt(args[1]);
			array[0][2]=Integer.parseInt(args[2]);
			array[1][0]=Integer.parseInt(args[3]);
			array[1][1]=Integer.parseInt(args[4]);
			array[1][2]=Integer.parseInt(args[5]);
			array[2][0]=Integer.parseInt(args[6]);
			array[2][1]=Integer.parseInt(args[7]);
			array[2][2]=Integer.parseInt(args[8]);
			System.out.println("Tyhe given array is :");
			printArray(array);
		}else {
			System.out.println("Please enter the 9 integer numbers");
			return;
		}
		int max=Integer.MIN_VALUE;
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array.length; j++) {	
			if(array[i][j]>max) {
				max=array[i][j];
			}
		}	
		}
	
		System.out.println("The biggest number in the given array is :"+ max);

	}
	

}
