package codingBat;

import java.util.Arrays;

public class RotateRightK {

	public int[] rotateRightK(int[] arr, int k) {
		for (int j = 0; j < k; j++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			}
			return arr;
	}
	
	public static void main(String[] args) {
		RotateRightK rtRight = new RotateRightK();
		int[] arr = new int[] {6, 7, 9, 0};
		int[] result = rtRight.rotateRightK(arr, 3);
		System.out.println(Arrays.toString(result));
	
	
	
	}
}
