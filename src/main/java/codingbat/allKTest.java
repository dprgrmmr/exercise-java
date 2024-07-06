package codingbat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class allKTest {

	@Test
	public void allKHappyCase() {
		Assertions.assertEquals(
				"h.e.l.l.o", 
				Util.allK(
						"hello", 
						"."));
	}
	
	@Test
	public void allKInputStringIsNullReturnsNull() {
		Assertions.assertEquals(
				null, 
				Util.allK(
						null, 
						"."));
	}
	
	@Test
	public void allKTargetStringIsNullReturnsInputString() {
		Assertions.assertEquals(
				"hello", 
				Util.allK(
						"hello", 
						null));
	}
	
	@Test
	public void allKInputStringHasLengthOfOneReturnsInputString() {
		Assertions.assertEquals(
				"o", 
				Util.allK(
						"o", 
						"."));
	}
}
