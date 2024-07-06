package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class arrayKTest {

	@Test
	public void arrayKHappyCase() {
		Assertions.assertEquals(
				2, 
				Util.arrayK(
						new int[] {1, 2, 5, 6, 5, 8}, 
						5, 
						1));
	}
	
	@Test
	public void arrayKNumLengthIsZeroReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.arrayK(
						new int[0], 
						5, 
						1));
	}
	
	@Test
	public void arrayKIndexOutOfBoundsReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.arrayK(
						new int[] {1, 2, 5, 6, 5, 8}, 
						5, 
						6));
	}
}
