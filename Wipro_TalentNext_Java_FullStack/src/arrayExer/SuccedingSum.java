package arrayExer;

public class SuccedingSum {
	public static void main(String[] args) {
		int []array=new int[]{1,6,4,7,9};
		int start=0;
		int end=0;
		int sum1=0;
		int sum2=0;
		for(int i=0; i<array.length;i++) {
			if(array[i]==6) {
				start=i;
				
			}
			if(array[i]==7) {
				end=i;
			}
			sum2+=array[i];
		}
		
		for(int i=start; i<=end;i++) {
			sum1+=array[i];
		}
		
		System.out.println("Succeding Sum :"+ (sum2-sum1));
		
	}
}
