package oopExer;
public class StringBuffer3 {
	public static String copies(String str) {
		if (str.length() < 2) {
			return "Input is less than 2 char :";
		}
		String add = str.substring(0, 2);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			result.append(add);
		}

		return result.toString();

	}

	public static void main(String[] args) {

		String str = "Wipro";
		System.out.println(copies(str));
		System.out.println(copies("Sm"));

	}

}
