package oopPractice;
  class ENC{
	private int x;
	private int y;
	public void setx(int x) {
		x=(x>79 ? 79 :(x<0 ? 0 :x));
		
	}
	public void sety(int y) {
		y=(y>79 ? 79 :(y<0 ? 0 :y));
		
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		ENC obj1=new ENC();
		obj1.setx(10);;
		obj1.sety(20);
		a=obj1.getx();
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
