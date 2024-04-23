package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FactorialKTest {

	@Test
	public void FactorialKHappyCase() {
		Assertions.assertEquals(
				40320, 
				Util.factorialK(
						8));
	}
	
	@Test
	public void FactorialKInputIsOneReturnsOne() {
		Assertions.assertEquals(
				1, 
				Util.factorialK(
						1));
	}
	
	@Test
	public void FactorialKInputIsZeroReturnsOne() {
		Assertions.assertEquals(
				1, 
				Util.factorialK(
						0));
	}
}
