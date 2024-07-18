package mcq;
public class mcq {
	public static void main(String[] arjgs)
{  
		
		//byte input1=128;  //Lossy conversion from Integer to byte
		byte input2=(byte)128; //Now it does not gives the compile time error
		byte input3=(byte)-130;
		
		//System.out.println(input1);
		System.out.println(input2);  //-128
		System.out.println(input3); //-130;
		
		
		
		float f=1.33f; //or float f=(float)1.2
		boolean B=true;
		System.out.println(f);
        System.out.println(B);	
        
         double input5=1.23; //or double input5=1.2D
         System.out.println(input5);
         
         int a=10, b=017, c=0x3A;
         System.out.println(a+ ","+ b + ","+c); // 01, 7*8^0 +1*8^1=15, 10*1=3*16=58
         
         String s="127";
         int ans=Integer.parseInt(s, 8); //But number should be 0 to 7 only not (e.g:128).
         int ans2=Integer.parseInt(s, 16);
         System.out.println(ans); //By converting the 127 into octal=1*8^0 +2*8^1+7*8^2=87
         System.out.println(ans2); 
         
         
         int ans3=Integer.parseInt(s); //String to integer directly
         System.out.println(ans3);
         
         String sec_input="1101011";
         int l=Integer.parseInt(sec_input,2);
         String  i=Integer.toOctalString(l); 
         System.out.println(i);
         System.out.println();
         System.out.println("The data type of i is: " + i.getClass().getSimpleName());
         
         
         
     	

}
	}
