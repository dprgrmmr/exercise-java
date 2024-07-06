package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class countNTest {

	@Test
	public void countNHappyCase() {
		Assertions.assertEquals(
				4, 
				Util.countN(
						1898838, 
						8));
	}
	
	@Test
	public void countNNoNReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countN(
						1898838, 
						4));
	}
	
	@Test
	public void countNNumLessThanNReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countN(
						2, 
						4));
	}
}
