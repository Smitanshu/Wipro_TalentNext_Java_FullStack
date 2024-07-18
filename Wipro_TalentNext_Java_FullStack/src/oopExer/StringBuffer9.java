package oopExer;

public class StringBuffer9 {
	public static String firstSecond(String str1, String str2) {
		StringBuffer ans = new StringBuffer();

		int maxLength = Math.max(str1.length(), str2.length());
		for (int i = 0; i < maxLength; i++) {

			if (i < str1.length()) {
				ans.append(str1.charAt(i));
			}

			if (i < str2.length()) {
				ans.append(str2.charAt(i));
			}

		}
		return ans.toString();

	}

	public static void main(String[] args) {

		System.out.println(firstSecond("Hel", "Worldd"));

	}

}
