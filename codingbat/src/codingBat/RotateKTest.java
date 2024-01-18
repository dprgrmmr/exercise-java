package codingBat;

import java.util.Arrays;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class RotateKTest {

	@Test
	public void rotateLeftIfKIsNeg(){
		RotateK rt = new RotateK();
		int[] arr = new int[] {1, 2, 3, 4, 5};
		int[] expected = new int[] {2, 3, 4, 5, 1};
		int[] result = rt.rotateK(arr, -1);
		Assertions.assertTrue(Arrays.equals(expected, result));
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {2, 3, 4, 5, 1}, 
						new RotateK().rotateK(
								new int[] {1, 2, 3, 4, 5}, -1)));
	}
	
	@Test
	public void rotateRightIfKIsPos() {
		Assertions.assertTrue(
				Arrays.equals(
						new int[] {5, 1, 2, 3, 4}, 
						new RotateK().rotateK(
								new int[] {1, 2, 3, 4, 5}, 1)));
	}
}
