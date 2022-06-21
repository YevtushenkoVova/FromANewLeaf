package methods.changeStrInArr;

import jdk.jfr.Description;

public class ChangeStr {

    @Description("Розбивает стринг по ; на масив стрингов")
    public static String[] changeStrInArr(String str) {
        String[] arr = str.split(";");
        for (String element : arr) {
        }
        return arr;
    }
}