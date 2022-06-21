package methods.strBits;

import jdk.jfr.Description;

public class StrBits {

    @Description(" Возращяет симолы с 0 и парным индексом ")
    public static String stringBits(String str) {
        String result ="";
        for(int i = 0; i < str.length(); i+=2){
            result  = result + str.charAt(i);
        }return result;
    }
}
