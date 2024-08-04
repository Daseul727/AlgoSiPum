package kds.week1;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        sum(nums, target);
    }

    public static int[] sum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
