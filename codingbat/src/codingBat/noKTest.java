package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class noKTest {

	@Test
	public void noKKIsNotInArrayReturnsTrue() {
		Assertions.assertEquals(true, ArrayUtil.noK(null, 0));
	}
	
	@Test
	public void noKKIsInArrayReturnsFalse() {
		Assertions.assertEquals(false, ArrayUtil.noK(null, 0));
	}
	
	@Test
	public void noKNullArrayReturnsTrue() {
		Assertions.assertEquals(false, ArrayUtil.noK(null, 0));
	}
	
	@Test
	public void noKEmptyArrayReturnsTrue() {
		Assertions.assertEquals(false, ArrayUtil.noK(null, 0));
	}
}
