package sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 7, 11, 1, 8, 13};
        int minIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
