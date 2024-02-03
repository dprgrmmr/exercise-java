package codingBat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class withoutKTest {

	@Test
	public void withoutKReturnsWithoutK() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {1, 2, 3, 0, 0}, 
						ArrayUtil.withoutTen(
								new int[] {1, 2, 10, 3, 10})));
	}
}
