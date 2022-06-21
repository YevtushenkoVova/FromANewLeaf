package methods.isSumaTwo;

import jdk.jfr.Description;

public class SumaTwoInArr {

    @Description("Ищет суму двух чисел равно number")
    public static boolean searchSuma(int[] arg, int number){
        boolean result = false;
        for(int i = 0; i < arg.length - 1; i++){
            for(int j = 1; j < arg.length; j++){
                if ((arg[i] + arg[j]) == number){
                    result = true ;
                    break;
                }
            }
        }return result;
    }
}
