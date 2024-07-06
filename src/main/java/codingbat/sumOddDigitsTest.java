package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class sumOddDigitsTest {
	
	@Test
	public void sumOddDigitsHappyCase() {
		Assertions.assertEquals(
				22, 
				Util.sumOddDigits(
						3745272));
	}
	
	@Test
	public void sumOddDigitsNoOddDigitsReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.sumOddDigits(
						28640));
	}
	
	@Test
	public void sumOddDigitsInputIsOneDigitAndOddReturnsInput() {
		Assertions.assertEquals(
				7, 
				Util.sumOddDigits(
						7));
	}
}
