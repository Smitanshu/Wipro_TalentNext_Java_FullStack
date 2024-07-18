package oopExer;

public class StringBuffer2 {
	public static String concatenateAndLowerCase(String str1, String str2) {
		String concatenated = str1 + str2;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < concatenated.length(); i++) {
			if (i > 0 && concatenated.charAt(i) == concatenated.charAt(i - 1)) {
				continue;
			}
			result.append(concatenated.charAt(i));
		}

		return result.toString().toLowerCase();
	}

	public static void main(String[] args) {

		String str1 = "Sachin";
		String str2 = "Tendulkar";
		System.out.println(concatenateAndLowerCase(str1, str2));

		str1 = "Mark";
		str2 = "kate";
		System.out.println(concatenateAndLowerCase(str1, str2));
	}
}
