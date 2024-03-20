package Day22;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] nums = {12, 10, 150, 32, 187, 5, 87};

        // 1. get total of all numbers

        // 2. get only the largest number.

        // 3. get sum of the largest and smallest number.

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        System.out.println("total = " + total);

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
//            max = max < nums[i] ? max : nums[i];
            max = Math.max(max, nums[i]);
//            min = min > nums[i] ? min : nums[i];
            min = Math.min(min, nums[i]);
        }

        System.out.println(max + min);

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[nums.length-1]);



    }
}
