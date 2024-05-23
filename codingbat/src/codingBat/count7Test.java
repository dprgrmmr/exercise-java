package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class count7Test {

	@Test
	public void count7HappyCase() {
		Assertions.assertEquals(
				3, 
				Util.count7(
						27377));
	}
	
	@Test
	public void count7No7FoundReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.count7(
						2392));
	}
	
	@Test
	public void count7InputLessThan7ReturnsZero() {
		Assertions.assertEquals(
				0, 
				Util.count7(
						6));
	}
}
