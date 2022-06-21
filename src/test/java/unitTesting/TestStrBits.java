package unitTesting;

import methods.strBits.StrBits;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStrBits {

    @Test
    public void checkStrBits(){
       String exp = StrBits.stringBits("asasasasasasas");
       String act = "aaaaaaa";
        Assert.assertEquals(exp, act);
    }

    @Test
    public void checkStrBits2(){
        String given = "212121";
        Assert.assertEquals(StrBits.stringBits(given),"222");
    }
}
