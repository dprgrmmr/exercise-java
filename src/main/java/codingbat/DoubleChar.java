package codingbat;

public class DoubleChar {
	
	public static void main(String[] args) {
		DoubleChar doubleChar = new DoubleChar();
		String result = doubleChar.doubleChar("abcd");
		System.out.println("The result equals " + result);
		System.out.println("doubleChar of null is " + doubleChar.doubleChar(null));
		System.out.println("DoubleChar of \"\" is " + doubleChar.doubleChar(""));
	}
	
	public String doubleChar(String str) {
		  StringBuffer result = new StringBuffer();
		  
		  if (str == null) {
			  return null;
		  }
		  
		  if (str.isEmpty()) {
			  return str;
		  }
		  
		  for (char c : str.toCharArray()){
			  result.append(c);
			  result.append(c);
		  }
		  
		  return result.toString();
		}
}
