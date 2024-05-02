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
	
	/**
	 * {@link allK} is a method that adds a custom String in between every character
	 * in an input String
	 * 
	 * @param str is the input String
	 * @param k is the target String
	 * 
	 * @return the input String with the target String added in between every character
	 */
	public static String allK(String str, String k) {
		
		if (str == null) {
			return null;
		}
		
		if (k == null) {
			return str;
		}
		
		 if (str.length() <= 1){
			    return str;
			  }
			  return str.substring(0,1) + k + allK(str.substring(1), k);
	}
	
	/**
	 * {@link arrayK} is a method that counts the number of times an integer appears
	 * in an array of integers after a certain index
	 * 
	 * @param nums is the input array of integers
	 * @param k is the target integer
	 * @param index is the starting index
	 * 
	 * @return the amount of times the integer k appears in nums after a certain index
	 */
	public static int arrayK(int[] nums, int k, int index) {
		
		if (nums.length == 0) {
			return 0;
		}

		if (index > nums.length) {
			return 0;
		}

		if (index < nums.length) {

			if (nums[index] == k) {
				return 1 + arrayK(nums, k, index + 1);
			}
		}
		return arrayK(nums, k, index + 1);
	}
	
	/**
	 * {@link countPairs} is a method that counts the number of pairs made of duplicate characters
	 * in a String separated by another character
	 * 
	 * @param str is the input String
	 * 
	 * @return the amount of "pairs" found in a String
	 */
	public static int countPairs(String str) {
		
		if (str == null) {
			return 0;
		}

		if (str.length() <= 2) {
			return 0;
		}
		
		if (str.substring(0, 1).equals(str.substring(2, 3))) {
			return 1 + countPairs(str.substring(1));

		}
		return countPairs(str.substring(1));
	}

	/**
	 * {@link endK} is a method that moves all instances of a specified String
	 * in an input String to the end of the input String
	 * 
	 * @param str is the input String
	 * @param k is the target String
	 * 
	 * @return the input String with all instances of k moved to the end
	 */
	public static String endK(String str, String k) {

		if (str == null) {
			return null;
		}

		if (k == null) {
			return str;
		}

		if (str.length() == 0) {
			return "";
		}

		if (str.substring(0, 1).equals(k)) {
			return endK(str.substring(1), k) + k;
		}

		return str.substring(0, 1) + endK(str.substring(1), k);
	}

	/**
	 * {@link triangle} is a method that determines the amount of squares
	 * that make up a triangle given that the first row has one square
	 * second row has two, third row has three, and so on.
	 * 
	 * @param rows is the number of rows in the triangle
	 * 
	 * @return the amount of squares that make up a specific triangle
	 */
	public static int triangle(int rows) {
		
		if (rows <= 0) {
			return 0;
		}
		
		return rows + triangle(rows - 1);
	}
	
	/**
	 * {@link countN} is a method that determines the amount of times
	 * a specific number appears as a digit in an input number
	 * 
	 * @param num is the input number
	 * @param n is the target number
	 * 
	 * @return the amount of times n appears as a digit in num
	 */
	public static int countN(int num, int n) {
		int count = 0;
		
		  if (num < n){
		    return 0;
		  }
		  
		  if (num % 10 == n){
		    return countN(num/10, n) + 1;
		  }
		  
		  return countN(num/10, n);
	}
	
	/**
	 * {@link factorialK} is a method that determines the factorial of an input integer
	 * 
	 * @param k is the input integer
	 * 
	 * @return the factorial of k
	 */
	public static int factorialK(int k) {

		if (k == 0) {
			return 1;
		}

		return k * factorialK(k - 1);
	}
	
	/**
	 * {@link changePi} is a method that changes all instances of the word, pi, in an input String
	 * to the mathematical number pi
	 * 
	 * @param str is the input String
	 * 
	 * @return the input String with all instances of pi changed to 3.14
	 */
	public static String changePi(String str) {
		
		if (str == null) {
			return null;
		}

		if (str.length() < 2) {
			return str;
		}

		if (str.substring(0, 2).equals("pi")) {
			return "3.14" + changePi(str.substring(2));
		}

		return str.substring(0, 1) + changePi(str.substring(1));
	}
	
	/**
	 * {@link array11} is a method that counts the number of times 11 appears in an array of integers
	 * after a certain index
	 * 
	 * @param nums is the input array
	 * @param index is the starting index
	 * 
	 * @return the number of instances of 11 in an array after a certain index
	 */
	public static int array11(int[] nums, int index) {
		
		if (nums.length == 0) {
			return 0;
		}
		
		if (index > nums.length) {
			return 0;
		}
		
		if (index < nums.length) {
			if (nums[index] == 11) {
				return 1 + array11(nums, index + 1);
			}
		}
		
		return array11(nums, index + 1);
	}
	
	/**
	 * {@link bunnyEars} is a method that adds the total number of bunny ears there are
	 * with a certain amount of bunnies
	 * 
	 * @param bunnies is the amount of bunnies
	 * 
	 * @return the total number of ears from a certain amount of bunnies
	 */
	public static int bunnyEars(int bunnies) {
		
		if (bunnies < 0) {
			return 0;
		}
		
		if (bunnies == 0) {
			return bunnies;
		}
		
		return 2 + bunnyEars(bunnies - 1);
	}
}
