package oopExer;
class Calculator{
	public static int powerInt(int num1, int num2 ) {
		return  (int)Math.pow(num1, num2);
		
	}
	
	public static double PowerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
		
	}
}
public class PowerCalculation {
	public static void main(String[] args) {
		int result1=Calculator.powerInt(2, 3);
		double result2=Calculator.PowerDouble(2.5, 3);
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
