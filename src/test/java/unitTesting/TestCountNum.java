package unitTesting;

import methods.count.CountNum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCountNum {

    @Test
    public void checkCountNum() {
        int[] array = {2, 2, 12, 2, 2, 87, 34, 53, 6, 12, 3242};
        Assert.assertEquals(CountNum.arrayCountNum(array, 12), 2);
    }

    @Test
    public void checkCountNum2() {
        int[] array = {51, 51, 515, 11, 54, 48, 7, 845, 12, 1, 8};
        Assert.assertEquals(CountNum.arrayCountNum(array, 13), 0);
    }
}
