package oopPractice;
public class mcq2 {
   int value=10;
	mcq2(int value){
		this.value=value;
		System.out.println("value  :"+ value);
	}
	public static void main(String[] args) {
		//mcq2 a=new mcq2();
		//default constructor  is not defined;
		mcq2 b=new mcq2(10);
		//It can run because parameterized constructor is present;
	}
}
