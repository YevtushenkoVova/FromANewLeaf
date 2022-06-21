package unitTesting;

import methods.search.SearchStr;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchStr {

    @Test
    public void checkSearchStr() {
        Assert.assertTrue(SearchStr.searchStr("ovasjc", "ova"));
    }

    @Test
    public void checkSearchStr2() {
        Assert.assertTrue(SearchStr.searchStr("123ffej", "12"));
    }
}
