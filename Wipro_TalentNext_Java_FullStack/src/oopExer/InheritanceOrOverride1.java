package oopExer;
class Fruit{
	String name;
	String taste;
	String size;
	 Fruit(String name, String taste,String size){
		this.size=size;
		this.name=name;
		this.taste=taste;
		
	}
	 public void eat() {
			System.out.println("Eating a " + name + " taste is "+ ".");
			
		}
}

class Apple extends Fruit{
	Apple(String size){
		super("Apple", "Sweet ", size);
	}
	public void eat() {
		System.out.println("Eating a " + name + " taste is "+ taste + "Delicious.");
		
	}
	
}
class Orange extends Fruit{
	Orange(String size){
	super("Orange","citrus", size);
		
	}
	public void eat() {
		System.out.println("Eating a " + name + " taste is "+ taste+" juicy.");
		
	}
}
public class InheritanceOrOverride1 {

	public static void main(String[] args) {
		
		Apple a=new Apple("medium");
		Orange o=new Orange("Small");
		a.eat();
		o.eat();
		
		
		
		

	}

}
