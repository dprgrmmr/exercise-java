package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class bigDiffTest {

	@Test
	public void bigDiffHappyCase(){
		Assertions.assertEquals(
				4, 
				ArrayUtil.bigDiff(
						new int[] {5, 4, 2, 6, 3}));
	}
	
	public void bigDiffArrayElementsAreAllTheSameReturnsZero(){
		Assertions.assertEquals(
				0, 
				ArrayUtil.bigDiff(
						new int[] {5, 5, 5, 5}));
	}
	
	public void bigDiffNullArrayReturnsZero(){
		Assertions.assertEquals(
				0, 
				ArrayUtil.bigDiff(
						null));
	}
	
	public void bigDiffEmptyArrayReturnsZero(){
		Assertions.assertEquals(
				0, 
				ArrayUtil.bigDiff(
						new int[0]));
	}
}
