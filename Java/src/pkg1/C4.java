package pkg1;

import java.util.Collections;
import java.util.ArrayList;

public class C4 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "";
		char[] chararr1 = str1.toCharArray();
		ArrayList<Character> list1 = new ArrayList<>();

		for (char c : chararr1) {
			list1.add(c);
		}
		Collections.shuffle(list1);
		for (char c : list1) {
			str2 += c;
		}

		System.out.println(str2);

	}
}
