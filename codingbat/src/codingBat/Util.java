package codingBat;

public class Util {

	public static String seq(int n) {
		
		if (n < 1) {
			return "";
		}
		return seq(n-1) + n + "\r\n";
	}
	
	public static String changeStr(String str, String str2, String str3) {
		
		if (str == null) {
			return str;
		}

		if (str2 == null) {
			return changeStr(str,"null", "null");
		}
		
		if (str3 == null) {
			return changeStr(str, str2, "null");
		}

		if (str.length() == 0) {
			return "";
		}
		if (str.substring(0, str2.length()).equals(str2)) {
			return str3 + changeStr(str.substring(str2.length()), str2, str3);
		}
		return str.substring(0, 1) + changeStr(str.substring(1), str2, str3);
	}
	
	
	public static String seqTwo(int start, int end) {
		if (end < start) {
			return "";
		}
		return seq(end -1) + end + "\r\n";
	}
}
