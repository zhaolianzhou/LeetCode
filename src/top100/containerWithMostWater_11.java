package top100;

public class containerWithMostWater_11 {
    public int maxArea(int[] height) {
        if (height.length <2)
            return 0;
        int left = 0, right = height.length-1;
        int volume = 0;
        int initVolume = (right-left)*Math.min(height[left], height[right]);
        while(left < right) {
            volume = Math.max(volume, (right-left)*Math.min(height[left], height[right]));
            if (height[right] > height[left])
                left++;
            else
                right--;
        }
        return volume;
    }

}
