package codingBat;

public class DoubleChar {
	
	public static void main(String[] args) {
		DoubleChar doubleChar = new DoubleChar();
		String result = doubleChar.doubleChar("abcd");
		System.out.println("The result equals " + result);
	}
	public String doubleChar(String str) {
		  StringBuffer result = new StringBuffer();
		  for (char c : str.toCharArray()){
		  result.append(c);
		  result.append(c);
		  }
		  return result.toString();
		}
}
