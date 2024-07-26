package collection;

import java.util.ArrayList;


public class ListArrayList {

   public static void printArrayList(ArrayList<String> arr ) {
	   for(Object i:arr) {
		   System.out.println(i);
	   }
   }
	public static void main(String[] args) {
		ArrayList<String> arr=new  ArrayList();
		arr.add("January");
		arr.add("February");
		
		arr.add("March");
		arr.add("April");
		
		arr.add("May");
		arr.add("June");
		
		arr.add("July");
		arr.add("August");
		
		arr.add("September");
		arr.add("October");
		
		arr.add("November");
		arr.add("December");
		
		printArrayList(arr);
		
	}

}
