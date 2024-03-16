package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class fibonacciKTest {

	@Test
	public void fibonacciKHappyCase(){
		Assertions.assertEquals(
				5, 
				Util.fibonacciK(
						5));
	}
	
	@Test
	public void fibonacciKIsZeroReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.fibonacciK(
						0));
	}
	
	@Test
	public void fibonacciKIsOneReturnsOne() {
		Assertions.assertEquals(
				1, 
				Util.fibonacciK(
						1));
	}
}
