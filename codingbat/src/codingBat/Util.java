package codingBat;

public class Util {

	public static String seq(int n) {
		
		if (n < 1) {
			return "";
		}
		return seq(n-1) + n + "\r\n";
	}
	
	public static String changeStr(String str, String str2) {
		
		if (str == null) {
			return str;
		}
		
		if (str2 == null) {
			changeStr(str, "null");
		}
		
		return str;
	}
}
