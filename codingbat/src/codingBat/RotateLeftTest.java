package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateLeftTest {

	@Test
	final void rotateLeft() {
		RotateLeft rotateLeft = new RotateLeft();
		int[] arr = new int[] {1, 2, 3, 4}; //use initializer to initiate a four element array
		int[] result = rotateLeft.rotateLeft(arr);	
		int[] expected = new int[] {2, 3, 4, 1};

		// Test an array with numbers
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
		
		// Test special cases
		result = rotateLeft.rotateLeft(null);
		assertEquals(null, result);
		
		int[] expected2 = new int[0];
		result = rotateLeft.rotateLeft(new int[] {});
		for (int i = 0; i < expected2.length; i++) {
			assertEquals(expected2[i], result[i]);
		}
	}

}
