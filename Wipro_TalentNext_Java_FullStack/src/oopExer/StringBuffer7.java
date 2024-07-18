package oopExer;
public class StringBuffer7 {
	public static StringBuilder remove(String str) {

		StringBuilder ans = new StringBuilder();
		ans.append(str);
		int len=ans.length();
		if (ans.charAt(0) == 'x') {
			ans.deleteCharAt(0);
			len=ans.length();
			
			
		}  if (ans.charAt(len - 1) == 'x') {
				ans.deleteCharAt(len - 1);
			}
		
		return ans;
	}
	public static void main(String[] args) {

		System.out.println(remove("xhix"));
		System.out.println(remove("xSmitanshux"));

	}

}
