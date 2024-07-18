package flowControlExer;
public class PrintPrime {  
	public static void main(String[] args) {
		int flag=0;
		for( int start=10;start<=99;start++) {
		     flag=0;
			for(int i=2; i<start;i++) {
				if(start%i==0) {
				flag=1;	
				break;
				}	
			}
		
		if(flag==0) {
			System.out.print(start+" ");
		    }
	}
		
		
		

	}

}
