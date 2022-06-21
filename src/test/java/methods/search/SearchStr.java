package methods.search;

import jdk.jfr.Description;

public class SearchStr {

    @Description("Возращает true при наличии search в data")
    public static boolean searchStr(String data, String search) {
        boolean result = false;
        if (data.length() > search.length()) {
            for (int i = 0; i < data.length() - search.length() + 1; i++) {
                if (data.substring(i, i + search.length()).equals(search)) {
                    result = true;
                }
            }
        } else {
            System.out.println("Invalid data");
        }
        return result;
    }
}
