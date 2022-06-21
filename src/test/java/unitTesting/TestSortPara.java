package unitTesting;

import methods.sortPara.SortPara;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSortPara {

    @Test
    public void checkSortPara() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(7);
        list.add(4);
        Assert.assertTrue(SortPara.sortPara(list).get(0) == 4);
    }

    @Test
    public void checkSortPara2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(4);
        list.add(14);
        Assert.assertTrue(SortPara.sortPara(list).get(1) == 14);
    }
}
