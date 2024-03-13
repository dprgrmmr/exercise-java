package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class countKeyTest {

	@Test
	public void countKeyHappyCase() {
		Assertions.assertEquals(
				3, 
				Util.countKey(
						"blahhillhinshin", 
						"hi"));
	}
	
	@Test
	public void countKeyNoKeyInString() {
		Assertions.assertEquals(
				0, 
				Util.countKey(
						"supercalifragilisticexpialidocious", 
						"hi"));
	}
	
	@Test
	public void countKeyInputStringIsNull() {
		Assertions.assertEquals(
				0, 
				Util.countKey(
						null, 
						"bob"));
	}
	
	@Test
	public void countKeyKeyStringIsNullCountsNull() {
		Assertions.assertEquals(
				2, 
				Util.countKey(
						"nullplanulls", 
						null));
	}
}
