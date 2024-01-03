package codingBat;

public class DoubleChar {
	
	public static void main(String[] args) {
		DoubleChar doubleChar = new DoubleChar();
		String result = doubleChar.doubleChar("abcd");
		System.out.println(result);
	}
	public String doubleChar(String str) {
		  String result = "";
		  for (int j = 0; j < str.length(); j++){
		  result += str.charAt(j) + str.charAt(j);
		  }
		  return result;
		}

}
