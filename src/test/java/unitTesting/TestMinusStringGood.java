package unitTesting;

import methods.minusStr.MinusStr;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMinusStringGood {

    @Test
    public void checkMinusStringGood() {
        Assert.assertEquals(MinusStr.minusStringGood("qqqqGood"), "qqqq");
    }

    @Test
    public void checkMinusStringGood2() {
        Assert.assertEquals(MinusStr.minusStringGood("Goodaaaa"), "aaaa");
    }
}
