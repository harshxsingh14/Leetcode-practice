public class Pallindrome_two {
    public boolean validPalindrome(String a) {
        int left = 0, right = a.length() - 1;

        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return isPalindrome(a.substring(0, left) + a.substring(left + 1)) ||
                       isPalindrome(a.substring(0, right) + a.substring(right + 1));
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String a) {
        int left = 0, right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
} 