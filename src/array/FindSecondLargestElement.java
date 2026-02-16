package array;

public class FindSecondLargestElement {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE + 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] < secondMax) {
                secondMax = nums[i];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);
    }
}
