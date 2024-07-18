package arrayExer;
import java.util.Arrays;
class ReemoveDuplicate{
	public static void main(String[] args) {
		        int[] inputArray = {12, 34, 12, 45, 67, 89, 45,11,12,34,45, 111};
		        int n = inputArray.length;
		        
		        
		        int[] tempArray = new int[n];
		        int j = 0;
		        
		        
		        for (int i = 0; i < n; i++) {
		            boolean isDuplicate = false;
		            for (int k = 0; k < j; k++) {
		                if (inputArray[i] == tempArray[k]) {
		                    isDuplicate = true;
		                    break;
		                }
		            }
		            if (!isDuplicate) {
		                tempArray[j++] = inputArray[i];
		            }
		            
		        }
		        int[] outputArray = Arrays.copyOf(tempArray, j);

		     
		        for(int i=0; i<outputArray.length;i++) {
		        	System.out.print(outputArray[i] + " ");
		        }
		}
}

		
	