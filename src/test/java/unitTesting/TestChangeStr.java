package unitTesting;

import methods.changeStrInArr.ChangeStr;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeStr {

    @Test
    public void checkCangeStr() {
        String str = "gsdg;sg;sg;sg;sg;sg";
        String[] arrays = ChangeStr.changeStrInArr(str);
        Assert.assertTrue(arrays.length == 6);
    }

    @Test
    public void checkCangeStr2() {
        String str = "gsdg;sg;s1g;sg4;sg;sg";
        String[] arrays = ChangeStr.changeStrInArr(str);
        Assert.assertTrue(arrays[3].equals("sg4"));
    }
}
