package codingbat;

import java.util.Arrays;

public class RotateRight {

	public int[] rotateRight(int[] arr) {
		if (arr == null) {
			return null;
		}
		
		if (arr.length == 0) {
			return arr;
		}
		
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		return arr;
	}
	
	public static void main(String[] args) {
		RotateRight rtRight = new RotateRight();
		int[] arr = new int[] {1, 2, 5, 8, 9};
		int[] result = rtRight.rotateRight(arr);
		System.out.println(Arrays.toString(result));
		
		result = rtRight.rotateRight(null);
		System.out.println(Arrays.toString(result));
		
		result = rtRight.rotateRight(new int[] {});
		System.out.println(Arrays.toString(result));
	}
}
