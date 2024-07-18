package arrayExer;
import java.util.Arrays;
public class ContainMiddle {
	public static int[] middleway(int []nums1, int []nums2) {
		int [] ans=new int[2];
		ans[0]=nums1[1];
		ans[1]=nums2[1];
		return ans;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(middleway( new int[]{1,2,3},  new int[] {4,5,6})));
		System.out.println(Arrays.toString(middleway(new int[] {7,7,7}, new int[] {3,8,0})));
		System.out.println(Arrays.toString(middleway(new int[] {5,2,9}, new int[] {1,4,5})));

	}

}
