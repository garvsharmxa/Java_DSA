package array;

public class PalindromeNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        for (int left = 0, right = arr.length - 1 ; left < right; left++, right--) {
            if (arr[left] != arr[right]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);

    }
}
