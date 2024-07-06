package codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class noPiTest {

    @Test
    public void noPiHappyCase(){
        Assertions.assertEquals(
                "hello",
                Util.noPi(
                        "helPilo"));
    }

    @Test
    public void noPiNoPiFoundReturnsInputString(){
        Assertions.assertEquals(
                "hello",
                Util.noPi(
                        "hello"));
    }

    @Test
    public void noPiInputIsNullReturnsNull(){
        Assertions.assertEquals(
                null,
                Util.noPi(
                        null));
    }

    @Test
    public void noPiInputIsPiReturnsEmptyString(){
        Assertions.assertEquals(
                "",
                Util.noPi(
                        "Pi"));
    }
}
