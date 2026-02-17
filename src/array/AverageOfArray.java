package array;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        float sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        sum = sum/ nums.length;

        System.out.println(sum);
    }
}
