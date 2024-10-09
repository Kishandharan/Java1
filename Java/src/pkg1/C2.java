package pkg1;

import java.util.Random;
public class C2 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int randnum = rand1.nextInt(str1.length());
		char randchar = str1.charAt(randnum);
		
		System.out.println(randchar);
	}
}
