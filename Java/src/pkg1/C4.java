package pkg1;

import java.util.Collections;
import java.util.ArrayList;

public class C4 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "";
		char[] chararr1 = str1.toCharArray();
		ArrayList<Character> arr1 = new ArrayList<>();

		for (char c : chararr1) {
			arr1.add(c);
		}
		Collections.shuffle(arr1);
		for (char c : arr1) {
			str2 += c;
		}

		System.out.println(str2);

	}
}
