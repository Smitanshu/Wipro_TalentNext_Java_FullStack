package arrayExer;
public class SecMinMax {
	public static void main(String[] args) {
	
	int [] arr=new int[] {101,65,24,75,24,67,124,653,144,4,124,5432};
	
	int Fmin=Integer.MAX_VALUE;
	int Smin=Integer.MAX_VALUE;
	
	int Fmax=Integer.MIN_VALUE;
	int Smax=Integer.MIN_VALUE;
			
	for(int i=0; i<arr.length;i++) {
		
		if(arr[i]<Fmin) {
			Smin=Fmin;
			Fmin=arr[i];
		}
		else if(arr[i]<Smin && arr[i]!=Fmin) {
			Smin=arr[i];
		}
		
		if(arr[i]>Fmax) {
			Smax=Fmax;
			Fmax=arr[i];
			
		}
		else if(arr[i]>Smax && arr[i]!=Fmax) {
			Smin=arr[i];
		}
		
		
	}
	System.out.println("2 Smallest number :"+Fmin + " "+ Smin);
	System.out.println("2 Largest Number :"+Fmax + " "+ Smax);
	
	
	
	}

}
