package array;

public class FindSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 700, 30, 40, 50, 600};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("minimum: " + min);
    }
}
