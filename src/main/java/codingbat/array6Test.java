package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class array6Test {

	@Test
	public void array6HappyCase() {
		Assertions.assertEquals(
				true, 
				Util.array6(
						new int[] {1, 6, 6, 2, 6}, 
						1));
	}
	
	@Test
	public void array6NoSixFoundReturnsFalse() {
		Assertions.assertEquals(
				false, 
				Util.array6(
						new int[] {1, 6, 6, 2, 7}, 
						3));
	}
	
	@Test
	public void array6EmptyArrayReturnsFalse() {
		Assertions.assertEquals(
				false, 
				Util.array6(
						new int[0], 
						3));
	}
	
	@Test
	public void array6IndexGreaterThanArrayLengthReturnsFalse() {
		Assertions.assertEquals(
				false, 
				Util.array6(
						new int[] {1, 6, 6, 2, 7}, 
						5));
	}
}
