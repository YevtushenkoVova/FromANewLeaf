package methods.count;

import jdk.jfr.Description;

public class CountNum {

    @Description("Считает num")
    public static int arrayCountNum(int[] nums, int num) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                n++;
            }
        }return n;
    }
}
