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
		
		if (str.length() == 0){
			return "";
		}
			  if (str.substring(0, str2.length()).equals(str2)){
			  return str2 + changeStr(str.substring(str2.length()), str2);
			  }
			  return str.substring(0,1) + changeStr(str.substring(1), str2);
	}
}
