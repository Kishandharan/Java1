package pkg1;

public class C3 {
	public static void main(String[] args) {
		String str1 = "FunWithProgramming";
		for(int i = 0; i < str1.length(); i++){
			System.out.println(str1.substring(0, i+1));
		}
		for(int i = str1.length()-1; i > 0; i--){
			System.out.println(str1.substring(0, i));
		}
	}
}
