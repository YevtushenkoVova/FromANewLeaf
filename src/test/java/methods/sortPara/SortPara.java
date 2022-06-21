package methods.sortPara;

import java.util.ArrayList;
import java.util.List;

public class SortPara {

    public static ArrayList<Integer> sortPara(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer element: list){
            if(element%2 == 0){
                result.add(element);
            }
        }return result;
    }

}
