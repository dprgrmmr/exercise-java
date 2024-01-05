package codingBat;

public class DoubleChar {
	
	public static void main(String[] args) {
		DoubleChar doubleChar = new DoubleChar();
		String result = doubleChar.doubleChar("abcd");
		System.out.println("The result equals " + result);
	}
	public String doubleChar(String str) {
		  StringBuffer result = new StringBuffer();
		  for (int j = 0; j < str.length(); j++){
		  result.append(str.charAt(j));
		  result.append(str.charAt(j));
		  }
		  String output = "" + result;
		  return output;
		}
}
