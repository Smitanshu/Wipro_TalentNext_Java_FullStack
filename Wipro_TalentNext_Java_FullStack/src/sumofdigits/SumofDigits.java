package sumofdigits;

public class SumofDigits {

	public static void main(String[] args) {
		
		int num=12345;
		int sum=0;
		while(num!=0) {
			int bit=num%10;
			sum+=bit;
			num/=10;
		}
		System.out.println(sum);

	}

}
