package oopExer;
class Animal{
	public void eat() {
		System.out.println("Animal is Eating ");
		
	}
	
	public void sleep() {
		System.out.println("Animal is Sleeping ");
	}
}

class Bird extends Animal{
	
	public void eat() {
		System.out.println("Bird is Eating ");
		
	}
	
	public void sleep() {
		System.out.println("Bird is Sleeping ");
	}
	
	public void fly() {
		System.out.println("Bird is flying ");
	}
	
	
}
public class InheritanceFirst {

	public static void main(String[] args) {
		
		Animal a1=new Animal();
		a1.sleep();
		a1.eat();
		
		System.out.println();
		Bird b1=new Bird();
		b1.sleep();
		b1.eat();
		b1.fly();
	

	}

}
