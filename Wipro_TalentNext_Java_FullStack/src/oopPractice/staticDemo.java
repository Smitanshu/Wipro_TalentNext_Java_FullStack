package oopPractice;
public class staticDemo {

	
	staticDemo(){
		System.out.println("Within ctor");
		
	}
	static {
		System.out.println("1st Static block");
	}
	static void m1() {
		System.out.println("In m1 method");
		
	}
	static {
		System.out.println(" 2 nd static block :");
		m1();
	}
	public static void main(String[] args) {
		
			
		
		System.out.println("Within main");
		}
		staticDemo x=new staticDemo();
	
		static {
			System.out.println("3rd static block");
		}
	}


