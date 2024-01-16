package codingBat;

import java.util.Arrays;

public class RotateK {

	public int[] rotateK(int[] arr, int k) {
		return null;
	}
	
	public static void main(String[] args) {
		RotateK rotatek = new RotateK();
		int[] arr = new int[] {1, 2, 3, 4};
		int[] result = rotatek.rotateK(arr, 1);
		System.out.println(Arrays.toString(result));
		
		result = rotatek.rotateK(null, 1);
		System.out.println(Arrays.toString(result));
		
		result = rotatek.rotateK(null, -1);
		System.out.println(Arrays.toString(result));
		
		result = rotatek.rotateK(new int[] {}, 1);
		System.out.println(Arrays.toString(result));
	}
}
