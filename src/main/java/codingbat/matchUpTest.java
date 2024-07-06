package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class matchUpTest {

	@Test
	public void matchUpHappyCase() {
		Assertions.assertEquals(
				2, 
				ArrayUtil.matchUp(
						new int[] {6, 3, 8, 9, 2}, 
						new int[] {6, 4, 8, 9, 3}));
	}
	
	@Test
	public void matchUpArrayOneIsNullReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.matchUp(
						null, 
						new int[] {6, 4, 8, 9, 3}));
	}
	
	@Test
	public void matchUpArrayTwoIsNullReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.matchUp(
						new int[] {6, 4, 8, 9, 3},
						null));
	}
	
	@Test
	public void matchUpDifferentArrayLengthsReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.matchUp(
						new int[] {6, 4, 8, 9, 3}, 
						new int[] {6, 4, 8, 9, 3, 3}));
	}
	
	@Test
	public void matchUpDifferentArrayLengthsAreZeroReturnsZero() {
		Assertions.assertEquals(
				0, 
				ArrayUtil.matchUp(
						new int[0], 
						new int[0]));
	}
}
