package unitTesting;

import methods.ChangeStr.ChangeStr;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeStrElem {

    @Test
    public void checkChange(){
        String str = "2jhb2bjb2kjn2jkn22jkn";
        String[] arr = ChangeStr.changeStrElem(str, "2");
        Assert.assertTrue(arr.length==7);
    }

    @Test
    public void checkChange2(){
        String str = "2jhb2bjb2kjn2jkn22jkn";
        String[] arr = ChangeStr.changeStrElem(str, "2");
        Assert.assertTrue(arr[0].equals(""));
    }
}
