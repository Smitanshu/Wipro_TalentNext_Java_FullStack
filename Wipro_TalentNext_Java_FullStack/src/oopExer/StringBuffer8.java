package oopExer;

public class StringBuffer8 {

	public static String removeAdjacentToStar(String str) {

		StringBuilder result = new StringBuilder();
		int len = str.length();

		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '*') {
				i++; // Skip the character to the right of *
			} else if (i > 0 && str.charAt(i - 1) == '*') {
				
				
				
				
			} else if (i < len - 1 && str.charAt(i + 1) == '*') {
				
				i++;
			} else {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}

	

	public static void main(String[] args) {
		String input = "ab*cd";
		System.out.println(removeAdjacentToStar(input)); // Output: "ad"
	}
}
