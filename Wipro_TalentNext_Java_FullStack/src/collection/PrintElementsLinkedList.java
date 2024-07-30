package collection;
import java.util.LinkedList;
import java.util.Iterator;
public class PrintElementsLinkedList {
	public static void printLinkedList(LinkedList<String> list) {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
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
		printLinkedList(list);
	}
}
