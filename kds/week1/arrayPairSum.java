package kds.week1;

import java.util.Arrays;

public class arrayPairSum {
    public static void main(String[] args) {
        int[] num = {1,4,3,2};
        sum(num);
    }

    public static int sum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
