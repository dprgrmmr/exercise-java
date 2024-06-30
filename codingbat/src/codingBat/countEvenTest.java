package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class countEvenTest {

	@Test
	public void countEvenHappyCase() {
		Assertions.assertEquals(
				2, 
				Util.countEven(
						12345));
	}
	
	@Test
	public void countEvenNoEvenDigitsReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countEven(
						13953));
	}
	
	@Test
	public void countEvenOneDigitIsEvenReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countEven(
						1));
	}
}
