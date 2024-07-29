package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ListIterator3 {

	public static void printAll(ArrayList<String> arr) {

		Iterator<String> iterator = arr.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Smitanshu");
		list.add("Ukey");
		list.add("Pune");
		list.add("Wipro");
		list.add("WiproTalenNext");
		printAll(list);
		
		
		

	}

}
