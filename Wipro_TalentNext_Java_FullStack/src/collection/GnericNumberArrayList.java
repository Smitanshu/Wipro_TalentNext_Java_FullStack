package collection;

//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;
public class GnericNumberArrayList {
	public static void printNumber(ArrayList<Number> list) {
		Iterator<Number> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();

		list.add(123);
		list.add(1.23);
		list.add(1.2f);
		list.add(345);

		printNumber(list);

	}
}
