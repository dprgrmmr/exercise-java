package codingBat;

import java.util.Arrays;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class RotateRightKTest {
	
	@Test
	public void rotateRightK() {
		RotateRightK rtRight = new RotateRightK();
		int[] arr = new int[] {6, 7, 9, 0};
		int[] expected = new int[] {7, 9, 0, 6};
		int[] result = rtRight.rotateRightK(arr, 3);
		Assertions.assertTrue(Arrays.equals(expected, result));
	}
	
	@Test
	public void rotateRightKArrayIsNull() {
		RotateRightK rtRight = new RotateRightK();
		int[] result = rtRight.rotateRightK(null, 2);
		Assertions.assertEquals(null, result);
	}
	
	@Test
	public void rotateRightKArrayLengthIsZero() {
		RotateRightK rtRight =  new RotateRightK();
		int[] result = rtRight.rotateRightK(new int[] {}, 2);
		Assertions.assertTrue(Arrays.equals(new int[] {}, result));
	}

}
