package oopExer;
class BOX{
	private double depth;
	private double width ;
	private  double height;
	public BOX(double depth, double width, double height){
		 this.depth=depth;
		 this.width=width;
		 this.height=height;
		 
	}
		public double  getvolume() {
			
			return  (width*height*depth);
		}
}

public class VolumeOfBox {
	public static void main(String[] args) {
		BOX mybox=new BOX(1,2,3);
		System.out.print("The volume of Box :");
		System.out.println(mybox.getvolume());
		

	}

}
