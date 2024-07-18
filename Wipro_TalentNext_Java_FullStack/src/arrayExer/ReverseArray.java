package arrayExer;
public class ReverseArray {
	public static void printArray(int[][]nums) {
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums.length;j++) {
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	int[][]nums=new int[2][2];
		if(args.length==4) {
			nums[0][0]=Integer.parseInt(args[0]);
			nums[0][1]=Integer.parseInt(args[1]);
			nums[1][0]=Integer.parseInt(args[2]);
			nums[1][1]=Integer.parseInt(args[3]);
			System.out.println("The given Array is :");
			printArray(nums);
		}else{
		System.out.println("Please enter 4 integer numbers");
		return ;
		}
		
		int [][]reverseArray=new int[2][2];
		reverseArray[0][0]=nums[1][1];
		reverseArray[0][1]=nums[1][0];
		reverseArray[1][0]=nums[0][1];
		reverseArray[1][1]=nums[0][0];
		
		System.out.println("The reverse of the array is :");
		printArray(reverseArray);
		
	}

}
