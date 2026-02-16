package array;

import java.util.Arrays;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}

