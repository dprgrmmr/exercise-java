package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class countOddTest {

	@Test
	public void countOddHappyCase() {
		Assertions.assertEquals(
				3, 
				Util.countOdd(
						12345));
	}
	
	@Test
	public void countOddNoOddDigitsReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countOdd(
						64826));
	}
	
	@Test
	public void countOddOneDigitIsEvenReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countOdd(
						2));
	}
}
