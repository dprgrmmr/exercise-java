package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class countPairsTest {

	@Test
	public void countPairsHappyCase() {
	Assertions.assertEquals(
			2, 
			Util.countPairs(
					"hehe"));	
	}
	
	@Test
	public void countPairsNoPairsReturnsZero() {
	Assertions.assertEquals(
			0, 
			Util.countPairs(
					"good"));	
	}
	
	@Test
	public void countPairsInputIsNullReturnsZero() {
	Assertions.assertEquals(
			0, 
			Util.countPairs(
					null));	
	}
	
	@Test
	public void countPairsInputLengthIsLessThanThreeReturnsZero() {
	Assertions.assertEquals(
			0, 
			Util.countPairs(
					"hi"));	
	}
}
