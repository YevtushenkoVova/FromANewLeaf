package unitTesting;

import methods.changeColor.ChangeColor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestChangeColor {

    @Test
    public  void checkColor(){
        Map<String,String> parametr =new HashMap<>();
        parametr.put("color", "black");
        ChangeColor.color(parametr);
        Assert.assertEquals(parametr.get("color"),"red");
    }

    @Test
    public  void checkColor2(){
        Map<String,String> parametr =new HashMap<>();
        parametr.put("size", "3");
        parametr.put("color", "black");
        ChangeColor.color(parametr);
        Assert.assertEquals(parametr.get("color"),"red");
    }
}
