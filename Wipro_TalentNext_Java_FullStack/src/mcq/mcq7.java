package mcq;
abstract class Shape {
	public abstract void draw();
}
public class mcq7 extends Shape{
	public void draw() {}
		
	
	}
public static void main(String[] args) {
	Shape s=new mcq7();
	s.draw();
	
}
}