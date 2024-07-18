package arrayExer;
public class SortArray {

	public static void main(String[] args) {
		Integer []arr=new Integer[] {9,8,7,6,5,4,3};
		int temp=0;
	
		for(int i=0; i<arr.length;i++) {
			
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
					 
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }	 }
		 
	}
		 
    for(int it:arr) {
	System.out.print(it+ " ");
}
	}
}
