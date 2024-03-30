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
		return seqTwo(start, end -1) + end + "\r\n";
	}
	
	/**
	 * {@link countKey} is a method that returns the number of times
	 * the string key is found in the string str
	 * 
	 * @param str is the input string
	 * @param key is the target string
	 * @return number of times key appears in str
	 */
	public static int countKey(String str, String key) {

		if (str == null) {
			return 0;
		}

		if (key == null) {
			return countKey(str, "null");
		}

		if (str.length() < key.length()) {
			return 0;
		}
		
		if (str.substring(str.length() - key.length(), str.length()).equals(key)) {
			return 1 + countKey(str.substring(0, str.length() - 1), key);
		}
		return countKey(str.substring(0, str.length() - 1), key);
	}
	
	/**
	 * {@link fibonnaciK} is a method that returns the kth number of
	 * the fibonacci sequence
	 * 
	 * @param k is the target number 
	 * @return the kth fibonnaci number
	 */
	public static int fibonacciK(int k) {
		  
		  if (k == 0){
		    return 0;
		  }
		  
		  if (k == 1){
		    return 1;
		  }
		  
		  return fibonacciK(k - 1) + fibonacciK(k - 2);
	}
	
	/**
	 * {@link cleanString} is a method that returns the input String
	 * without any consecutive duplicate elements
	 * 
	 * @param str is the input String
	 * @return str without any consecutive duplicate elements
	 */
	public static String cleanString(String str) {
		
		if (str == null) {
			return "null";
		}
		
		if (str.length() == 0) {
			return str;
		}
		
		  if (str.length() == 1){
			    return str;
			  }
			  if (str.substring(0,1).equals(str.substring(1,2))){
			    return cleanString(str.substring(1));
			  }
			  return str.substring(0,1) + cleanString(str.substring(1));
	}
	
	
	/**
	 * {@link powerK} is a method that returns the base integer
	 * to the kth power
	 * 
	 * @param base is the input integer
	 * @param k is the exponent number
	 * @return base to the kth power
	 */
	public static int powerK(int base, int k) {
		
		if (k == 0) {
			return 1;
		}
		
		if (k == 1) {
			return base;
		}
		return base * powerK(base, (k - 1));
	}
	
	/**
	 * {@link noKey} is a method that returns the input String with all
	 * instances of key removed
	 * 
	 * @param str is the input String
	 * @param key is the target String
	 * @return input String with all instances of key removed
	 */
	public static String noKey(String str, String key) {
		
		if (str == null) {
			return null;
		}
		
		if (key == null) {
			return str;
		}
		
		if (str.length() == 0) {
			return str;
		}
		  if (key.length() == 0){
			    return str;
			  }
			  if (str.substring(0, key.length()).equals(key)){
			  return noKey(str.substring(key.length()), key);
			  }
			  return str.substring(0,1) + noKey(str.substring(1), key);
			}
	
	/**
	 * {@link sumDigits} is a method that returns the sum of all the digits
	 * in the input number
	 * 
	 * @param n is the input Integer
	 * @return the sum of all the digits that make up the input number
	 */
	public static int sumDigits(int n) {
		
			  if (n / 10 == 0){
			    return n;
			  }
			    return (n % 10) + sumDigits(n / 10);
	}
	
	/**
	 * {@link pairK} is a method that adds a custom String in between pairs of 
	 * duplicate elements in a String
	 * 
	 * @param str is the input String
	 * @param k is the target String
	 * 
	 * @return the input String with the target String added in between
	 * consecutive duplicate elements
	 */
	public static String pairK(String str, String k) {
		
		if (str == null) {
			return null;
		}
		
		if (k == null) {
			return pairK(str, "null");
		}
		
		if (str.length() <= 1) {
			return str;
		}

		if (str.substring(0, 1).equals(str.substring(1, 2))) {
			return str.substring(0, 1) + k + pairK(str.substring(1), k);
		}

		return str.substring(0, 1) + pairK(str.substring(1), k);
	}
}
