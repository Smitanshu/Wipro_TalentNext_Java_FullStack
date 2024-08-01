package com.LogicBuldingHourPlanM2;

import java.util.Scanner;

public class AdditionOfTwoStrings {

	public static int addition(String s1, String s2) {
		int sum = 0;
		String temp= "", result = "";

		int len1 = s1.length();
		int len2 = s1.length();

		if (len1 > len2) {
			temp = s1;
			s1 = s2;
			s2 = s1;
		}
		len1 = s1.length();
		len2 = s2.length();
		

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.next();
		System.out.println("Enter Second String");
		String s2 = sc.next();

		int ans = addition(s1, s2);
		System.out.println(ans);

	}

}
