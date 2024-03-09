package codingBat;

public class Util {

	/**
	 * {@link seq} is a method that returns numbers from one to n
	 * each on a new line
	 * 
	 * @param n is the start number
	 * @return numbers from one to n
	 */
	public static String seq(int n) {
		
		if (n < 1) {
			return "";
		}
		return seq(n-1) + n + "\r\n";
	}
	
	/**
	 * {@link changeStr} is a method that returns the input String with all
	 * appearances of str2 replaced with str3
	 * 
	 * @param str is the main string
	 * @param str2 is the string being replaced
	 * @param str3 is the string replacing str2
	 * @return main string with instances of str2 replaced with str3
	 */
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
	
	/**
	 * {@link seqTwo} is a method that returns numbers from start to end
	 * each on a new line
	 * 
	 * @param start is the start number
	 * @param end is the end number
	 * @return numbers from start to end
	 */
	public static String seqTwo(int start, int end) {
		if (end < start) {
			return "";
		}
		return seq(end -1) + end + "\r\n";
	}
}
