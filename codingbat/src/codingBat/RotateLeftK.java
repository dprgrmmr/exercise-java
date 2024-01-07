package codingBat;

import java.util.Arrays;

public class RotateLeftK {

	public int[] rotateLeftK(int[] arr, int k) {
		return null;
	}
	
	
	
	public static void main(String[] args) {
		RotateLeftK rtLeft = new RotateLeftK();
		int[] arr = new int[] {1, 3, 5, 8, 7};
		int[] result = rtLeft.rotateLeftK(arr, 2);
		System.out.println(Arrays.toString(result));
		
		result = rtLeft.rotateLeftK(null, 2);
		System.out.println(Arrays.toString(result));
		
		result = rtLeft.rotateLeftK(new int[] {}, 2);
		System.out.println(Arrays.toString(result));
	}
}
