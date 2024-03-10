package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SeqTest {

	@Test
	public void seqHappyCase() {
		Assertions.assertEquals("1\r\n2\r\n3\r\n4\r\n5\r\n", Util.seq(5));
	}
	
	@Test
	public void seqReturnsEmptyOnNegativeNumbers() {
		Assertions.assertEquals("", Util.seq(-1));
	}
	
	@Test
	public void seqReturnsEmptyOnZero() {
		Assertions.assertEquals("", Util.seq(0));
	}
}
