package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class array220Test {

	@Test
	public void array220HappyCase() {
		Assertions.assertEquals(
				true, 
				Util.array220(
						new int[] {1, 4, 3, 30, 8}, 
						0));
	}
	
	@Test
	public void array220EmptyArrayReturnsFalse() {
		Assertions.assertEquals(
				false, 
				Util.array220(
						new int[0], 
						0));
	}
	
	@Test
	public void array220IndexTooBigReturnsFalse() {
		Assertions.assertEquals(
				false, 
				Util.array220(
						new int[] {7, 3, 8, 8},
						4));
	}
}
