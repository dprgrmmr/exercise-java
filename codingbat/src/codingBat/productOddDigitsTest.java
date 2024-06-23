package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class productOddDigitsTest {

	@Test
	public void productOddDigitsHappyCase() {
		Assertions.assertEquals(
				21, 
				Util.productOddDigits(
						3871));
	}
	
	@Test
	public void productOddDigitsNoOddDigitsReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.productOddDigits(
						28640));
	}
	
	@Test
	public void productOddDigitsInputIsOneDigitAndOddReturnsInput() {
		Assertions.assertEquals(
				7, 
				Util.productOddDigits(
						7));
	}
}
