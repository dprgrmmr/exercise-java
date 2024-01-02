package codingBat;

public class DoubleChar {
	
	public String doubleChar(String str) {
		  String word = "";
		  for (int j = 0; j < str.length(); j++){
		  word += str.substring(j, j+1) + str.substring(j, j+1);
		  }
		  return word;
		}
}
