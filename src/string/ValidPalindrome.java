package string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama\n";

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip non-alphanumeric from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // skip non-alphanumeric from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // compare characters (ignore case)
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                System.out.println(false);
            }

            left++;
            right--;
        }
        System.out.println(true);


    }
}
