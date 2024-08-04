package kds.week1;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        product(nums);
    }

    public static int[] product(int[] nums) {
        int[] result = new int[nums.length];
        int p = 1;
        for (int i=0; i<nums.length; i++) {
            result[i] = p;
            p *= nums[i];
        }
        p = 1;
        for (int i=nums.length-1; i>= 0; i--) {
            result[i] *= p;
            p *= nums[i];
        }

        return result;
    }
}
