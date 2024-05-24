package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class countAbcTest {

	@Test
	public void countAbcHappyCase() {
		Assertions.assertEquals(
				3, 
				Util.countAbc(
						"abslabcabckaba"));
	}
	
	@Test
	public void countAbcInputNullReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countAbc(
						null));
	}
	
	@Test
	public void countAbcLengthLessThan3ReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.countAbc(
						"ab"));
	}
}
