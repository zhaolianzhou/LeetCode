package com.company;

import java.util.Arrays;

public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        if (nums==null) {
            return 0;
        }
        int len = nums.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return result;
    }

    public static void main(String[] args) {
        RemoveElement_27 instance = new RemoveElement_27();
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(instance.removeElement(nums, 2));
    }
}
