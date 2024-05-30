package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class parenBitTest {

	@Test
	public void parenBitHappyCase(){
		Assertions.assertEquals(
				"(hello)", 
				Util.parenBit(
						"sap(hello)wals"));
	}
	
	@Test
	public void parenBitNoEndingParenthesisReturnsTheRestOfString(){
		Assertions.assertEquals(
				"(hello)", 
				Util.parenBit(
						"sap(hello"));
	}
	
	@Test
	public void parenBitNoParenthesisReturnsEmptyParenthesis(){
		Assertions.assertEquals(
				"()", 
				Util.parenBit(
						"saphello"));
	}
}
