package array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 5, 6, 0, 8, 9};

        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
