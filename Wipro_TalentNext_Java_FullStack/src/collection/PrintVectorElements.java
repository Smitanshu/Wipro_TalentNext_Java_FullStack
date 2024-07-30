package collection;
import java.util.Vector;
import java.util.Iterator;

public class PrintVectorElements {
	
		public static void printVector(Vector<String> months) {
			Iterator<String> iterator = months.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		public static void main(String[] args){
			Vector<String> list=new Vector<String>();
			list.add("January");
			list.add("February");
			list.add("March");
			list.add("April");
			list.add("May");
			list.add("June");
			list.add("July");
			list.add("August");
			list.add("September");
			list.add("October");
			list.add("November");
			list.add("December");
			printVector(list);
		}
	}



