package arrayExer;
import java.util.Arrays;
public class EvenOddSort {
	public static  int[]evenOdd(int []nums){
		int []ans=new int[nums.length];
		int index=0;
		int count=0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]%2==0 || nums[i]==0) {
				count++;
			}
			
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0 ) {
				ans[index]=nums[i];
				index++;
				
			}else {
				ans[count]=nums[i];
				count++;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("Output :"+ Arrays.toString(evenOdd(new int[] {1,0,1,0,0,1,1})));
		System.out.println("Output :"+ Arrays.toString(evenOdd(new int[] {3,3,2})));
		System.out.println("Output :"+ Arrays.toString(evenOdd(new int[] {2,2,2})));
		
	}

}
