package codingbat;

import java.util.Arrays;

public class RotateK {

	public int[] rotateK(int[] arr, int k) {
		
		if (arr == null) {
			return null;
		}
		
		if (arr.length == 0) {
			return arr;
		}
		
		if (k == 0) {
			return arr;
		}
		
		if (k < 0) {
			RotateLeftK rtLeftNeg = new RotateLeftK();
			return rtLeftNeg.rotateLeftK(arr, (0 - k));
		}
		RotateRightK rtRightPos = new RotateRightK();
		return rtRightPos.rotateRightK(arr, k);
	}
	
	public static void main(String[] args) {
		RotateK rotatek = new RotateK();
		int[] arr = new int[] {1, 2, 3, 4};
		int[] result = rotatek.rotateK(arr, 1);
		System.out.println(Arrays.toString(result));
		
		result = rotatek.rotateK(null, 1);
		System.out.println(Arrays.toString(result));
		
		result = rotatek.rotateK(arr, -1);
		System.out.println(Arrays.toString(result));
		
		result = rotatek.rotateK(new int[] {}, 1);
		System.out.println(Arrays.toString(result));
	}
}
