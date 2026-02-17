package array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {1,2,2,2,3,4};
        int count = 0;
        int val = 2;

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }

    }
}
