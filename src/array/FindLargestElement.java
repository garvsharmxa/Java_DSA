package array;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 700, 30, 40, 50, 600};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("maximum: " + max);
    }
}
