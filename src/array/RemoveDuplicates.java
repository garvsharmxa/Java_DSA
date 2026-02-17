package array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5};

        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        // print only unique part
        System.out.println(Arrays.toString(Arrays.copyOf(nums, index + 1)));
    }
}
