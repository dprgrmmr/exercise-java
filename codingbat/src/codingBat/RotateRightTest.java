package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RotateRightTest {

	@Test
	final void rotateRight() {
		RotateRight rtRight = new RotateRight();
		int[] arr = new int[] {1, 2, 3, 4}; 
		int[] result = rtRight.rotateRight(arr);	
		int[] expected = new int[] {4, 1, 2, 3};

		
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
		
	
		result = rtRight.rotateRight(null);
		assertEquals(null, result);
		
		int[] expected2 = new int[0];
		result = rtRight.rotateRight(new int[] {});
		for (int i = 0; i < expected2.length; i++) {
			assertEquals(expected2[i], result[i]);
		}
	}
}
