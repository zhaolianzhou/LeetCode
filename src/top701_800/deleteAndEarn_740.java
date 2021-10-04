package top701_800;

import java.util.HashMap;
import java.util.Optional;

public class deleteAndEarn_740 {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();
        int max = 0;
        for (int i: nums) {
            if (i>max)
                max = i;
            if (occurrenceMap.containsKey(i)) {
                occurrenceMap.put(i, occurrenceMap.get(i)+i);
            } else {
                occurrenceMap.put(i, i);
            }
        }

        int[] occurrence = new int[max+1];
        for (int key: occurrenceMap.keySet()) {
            occurrence[key] = occurrenceMap.get(key);
        }

        return robHelper(occurrence);

    }
    private int robHelper(int[] nums) {
        int size = nums.length;
        if (size==1)
            return nums[0];
        if (size == 2)
            return Math.max(nums[0], nums[1]);
        int[] currentNumber = new int[2];
        currentNumber[0] = nums[0];
        currentNumber[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int current = Math.max(nums[i] + currentNumber[0], currentNumber[1]);
            currentNumber[0] = currentNumber[1];
            currentNumber[1] = current;
        }
        return Math.max(currentNumber[0], currentNumber[1]);
    }
}
