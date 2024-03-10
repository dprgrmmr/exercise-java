package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class seqTwoTest {

	@Test
	public void seqTwoHappyCase() {
		Assertions.assertEquals(
				"4\r\n5\r\n6\r\n7\r\n", 
				Util.seqTwo(4, 
						7));
	}
	
	@Test
	public void seqTwoReturnsEmptyWhenStartIsGreaterThanEnd() {
		Assertions.assertEquals(
				"", 
				Util.seqTwo(4, 
						3));
	}
	
	@Test
	public void seqTwoReturnsCorrectOrderWhenStartAndEndAreNegative() {
		Assertions.assertEquals(
				"-4\r\n-3\r\n-2\r\n", 
				Util.seqTwo(-4, 
						-2));
	}
}
