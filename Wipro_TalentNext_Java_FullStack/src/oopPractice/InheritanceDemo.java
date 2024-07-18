package oopPractice;




class A{
	int m, n;
	 void display1() {
		 System.out.println(m +" "+ n);
		 
	 }
}
class B extends A{
	int c;
	void display2() {
		System.out.println(c +" ");
	}
	void displaySum() {
		System.out.println("Sum :"+(m+n+c));
		
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		
		obj1.m=10;
		obj1.n=15;
		System.out.println("In class A");
		obj1.display1();
		
		System.out.println("In class B");
		B obj3=new B();
		obj3.c=20;
		obj3.displaySum();
		
		
		
		
		

	}

}
