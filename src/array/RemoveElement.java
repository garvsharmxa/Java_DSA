package array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {1,2,2,2,3,4};
        int target = 3;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
          if(nums[i] == target){

          }
        }
        System.out.println(Arrays.toString(nums));
    }
}
