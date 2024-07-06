package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class pairKTest {

	@Test
	public void pairKHappyCase() {
		Assertions.assertEquals(
				"helylo", 
				Util.pairK(
						"hello", "y"));
	}
	
	@Test
	public void pairKEmptyQuote() {
		Assertions.assertEquals(
				"hello", 
				Util.pairK(
						"hello", ""));
	}
	
	@Test
	public void pairKNullInputReturnsNull() {
		Assertions.assertEquals(
				null, 
				Util.pairK(
						null, "hi"));
	}
	
	@Test
	public void pairKTargetNull() {
		Assertions.assertEquals(
				"helnulllo", 
				Util.pairK(
						"hello", "null"));
	}
}
