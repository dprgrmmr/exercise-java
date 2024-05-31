package codingBat;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NBitTest {
	
	@Test
	public void NBitHappyCase(){
		Assertions.assertEquals(
				"cube", 
				Util.NBit(
						"lcubel", "l"));
	}
	
	@Test
	public void NBitNoEnclosingTargetStringReturnsTheRestOfString(){
		Assertions.assertEquals(
				"cuberubix", 
				Util.NBit(
						"hcuberubix", "h"));
	}
	
	@Test
	public void NBitNoTargetStringReturnsEmptyString(){
		Assertions.assertEquals(
				"", 
				Util.NBit(
						"saphello", "k"));
	}
}
