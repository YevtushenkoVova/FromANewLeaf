package unitTesting;

import methods.strInt.StrInInt;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStrInt {

    @Test
    public void checkStrInt() {
        int x = StrInInt.strInt("20");
        Assert.assertTrue(x / 2 == 10);
    }

    @Test
    public void checkStrInt2() {
        int q = StrInInt.strInt("30");
        Assert.assertTrue(q - 10 == 20);
    }
}
