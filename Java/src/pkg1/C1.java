package pkg1;

public class C1 {
	public static void diamond1(String str1) {
		String str2 = "";
		for(int i = 1; i<=str1.length(); i++) {
			str2 = str1.substring(0, i);
			System.out.println(str2);
		}
		for(int i = str1.length()-1; i >= 1; i--) {
			str2 = str1.substring(0, i);
			System.out.println(str2);
		}
	}
	
	public static void main(String[] args) {
		diamond1("FunWithProgrammingUsingPython");
		diamond1("FunWithProgrammingUsingJava");
		diamond1("FunWithProgrammingUsingRESTAPI");
	}
}
