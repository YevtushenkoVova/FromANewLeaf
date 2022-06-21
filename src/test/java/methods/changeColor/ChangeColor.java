package methods.changeColor;

import jdk.jfr.Description;

import java.util.Map;

public class ChangeColor {

    @Description("В ключе color записывает red")
    public static Map<String, String> color(Map<String, String> map) {
        if (map.containsKey("color")) {
            map.put("color", "red");
        }
        return map;
    }
}
