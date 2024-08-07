package codingbat;

import java.util.Arrays;

public class RotateLeft {

	public int[] rotateLeft(int[] arr) {
		if (arr == null) {
			return null;
		}
		
		if (arr.length == 0) {
			return arr;
		}
		
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;
	}
	
	public static void main(String[] args) {
		RotateLeft rotateLeft = new RotateLeft();
		int[] arr = new int[] {1, 2, 3, 4}; //use initializer to initiate a four element array
		int[] result = rotateLeft.rotateLeft(arr);
		System.out.println(Arrays.toString(result));
		
		result = rotateLeft.rotateLeft(null);
		System.out.println(Arrays.toString(result));
		
		result = rotateLeft.rotateLeft(new int[] {});
		System.out.println(Arrays.toString(result));
	}
}
