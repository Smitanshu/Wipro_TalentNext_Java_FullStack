package arrayExer;
import java.util.Arrays;
public class WithoutTens {
	public static int[] removeTen(int[]arr){
		int[]ans=new int[arr.length];
		int index=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=10) {
				ans[index]=arr[i];
				index++;
			}	
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("Output :"+ Arrays.toString(removeTen(new int[] {1,10,10,2})));
		System.out.println("Output :"+ Arrays.toString(removeTen(new int[] {10,2,10})));
		System.out.println("Output :"+ Arrays.toString(removeTen(new int[] {1,99,10})));
	}
}
