package methods.minusStr;

import jdk.jfr.Description;

public class MinusStr {

    @Description("Вырезает стрингу G??d")
    public static String minusStringGood(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 3 < str.length() && str.charAt(i) == 'G' && str.charAt(i + 3) == 'd') {
                i = i + 3;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
