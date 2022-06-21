package unitTesting;

import methods.isSumaTwo.SumaTwoInArr;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchSuma {

    @Test
    public void checkSearchSuma() {
        int[] arr = {56, 484, 351, 4, 11, 584, 1};
        Assert.assertTrue(SumaTwoInArr.searchSuma(arr, 15));
    }

    @Test
    public void checkSearchNoSuma() {
        int[] arr = {51, 5, 1, 18, 4, 1208, 34, 216};
        Assert.assertNotEquals(arr, 5);
    }
}
