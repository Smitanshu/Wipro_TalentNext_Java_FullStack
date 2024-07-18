package arrayExer;
public class IsPresent {
	public static void main(String[] args) {
		int []array={1,4 ,34,36,7};
		
		int search=Integer.parseInt(args[0]);
		int ans=searchEle(array,search);
		System.out.println(ans);
 }
		public static int searchEle(int []array , int search) {
		for(int i=0; i<array.length;i++){
			if(array[i]==search) {
				return i;		
			}
		}
		return -1;
   }
}


