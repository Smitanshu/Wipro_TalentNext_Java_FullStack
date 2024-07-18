package mcq;


class absract Gbase{
	public void testBase() {
		System.err.println("In Gbase CTOR");
	}
}
public class mcq6  extends Gbase{
	

	public static void main() {
		Gbase ob =new Gbase();
		//cannot create the object of the abstract class
		ob.testBase();
		//method undefined for type Gbase
		

	}

}
