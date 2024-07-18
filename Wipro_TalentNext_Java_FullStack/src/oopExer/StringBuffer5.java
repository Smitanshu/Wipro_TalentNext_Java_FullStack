package oopExer;

public class StringBuffer5 {
	public static String removeFirstLast(String str) {
		String str1 = str.substring(1, str.length() - 1);
		return str1;
	}

	public static void main(String[] args) {

		System.out.println(removeFirstLast("Suman"));
		System.out.println(removeFirstLast("Smitanshu"));
	}
}
