package oopExer;

public class StringBuffer4 {

	public static String half(String str) {

		if ((str.length()) % 2 == 0) {

			String result = str.substring(0, (str.length()) / 2);

			return result.toString();

		}
		return "null";

	}

	public static void main(String[] args) {

		System.out.println(half("TomCat"));
		System.out.println(half("apron"));

	}

}
