package top100;

public class jumpGame_55 {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        if (length==1)
            return nums[0]>0;

        int reach = 0;
        for (int i=0; i < length; i++) {
            reach = Math.max(reach, i+ nums[i]);
            if (reach == i)
                return false;
            else if (reach >= length)
                return true;
        }

        return reach>=length;
    }
}
