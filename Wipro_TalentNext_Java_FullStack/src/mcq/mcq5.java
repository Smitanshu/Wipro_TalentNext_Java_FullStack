package mcq;

java.sql;
java.dbms;



 abstract class Gbase{
	 Gbase(){
		 System.out.println("In Gbase CTOR");
	 }
  abstract void testbase();
}
public class mcq5 extends Gbase {
    void testbase(){
    	System.out.println("In testbase");
		
	}
	public static void main(String[] args) {
		mcq5 ob=new mcq5();
		ob.testbase();
		

	}

}
//class should be abstract
// mcq5 should contain the override method definition testbase()